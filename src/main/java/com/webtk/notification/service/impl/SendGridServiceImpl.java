package com.webtk.notification.service.impl;

import com.sendgrid.*;
import com.webtk.notification.exception.MailException;
import com.webtk.notification.service.SmtpService;
import lombok.extern.slf4j.Slf4j;
import message.SendMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.Base64;
import java.util.Objects;

@Component
@Slf4j
@ConditionalOnProperty(
        name = "notification.smtpName",
        havingValue = "sendGrid")
public class SendGridServiceImpl implements SmtpService {

    @Autowired
    private SendGrid sendGrid;
    private String bodyContentType = "text/html";

    @Override
    public void createMailAndSend(
            String to, String from, String subject, String bodyText, MultipartFile attachment) {
        Mail mail = createMail(to, from, subject, bodyText);
        if (Objects.nonNull(attachment)) {
            try {
                String attachmentContent = Base64.getEncoder().encodeToString(attachment.getBytes());
                setAttachmentIfPresent(
                        attachmentContent, attachment.getContentType(), attachment.getOriginalFilename(), mail);
            } catch (IOException e) {
                log.error("setAttachmentIfPresent() exception", e);
                throw new MailException(e);
            }
        }
        sendMailUsingSendGrid(mail);
    }

    @Override
    public void createMailAndSend(SendMessage consumerRecord) {
        if (Objects.isNull(consumerRecord)) {
            log.error("Not processing SendMessage record");
        }
        Mail mail =
                createMail(
                        consumerRecord.getTo(),
                        consumerRecord.getFrom(),
                        consumerRecord.getSubject(),
                        consumerRecord.getBodyText());
        if (!StringUtils.isEmpty(consumerRecord.getAttachmentContent())) {
            setAttachmentIfPresent(
                    consumerRecord.getAttachmentContent(),
                    consumerRecord.getAttachmentContentType(),
                    consumerRecord.getAttachmentFilename(),
                    mail);
        }
        sendMailUsingSendGrid(mail);
    }

    private void setAttachmentIfPresent(
            String attachmentContent, String contentType, String filename, Mail mail) {
        if (!StringUtils.isEmpty(attachmentContent)) {
            Attachments attachment = new Attachments();
            attachment.setContent(attachmentContent);
            attachment.setType(contentType);
            attachment.setFilename(filename);
            attachment.setDisposition("attachment");
            attachment.setContentId(filename);
            mail.addAttachments(attachment);
        }
    }

    private Mail createMail(String to, String from, String subject, String bodyText) {
        Email fromEmail = new Email(from);
        Email toEmail = new Email(to);
        Content bodyContent = new Content(bodyContentType, "." + bodyText);
        Mail mail = new Mail(fromEmail, subject, toEmail, bodyContent);
        mail.setReplyTo(fromEmail);
        return mail;
    }

    private void sendMailUsingSendGrid(Mail mail) {
        try {
            Request request = new Request();
            request.setMethod(Method.POST);
            request.setEndpoint("mail/send");
            request.setBody(mail.build());
            sendGrid.api(request);
        } catch (IOException ex) {
            log.error("sendMailUsingSendGrid() exception", ex);
            throw new MailException(ex);
        }
    }
}
