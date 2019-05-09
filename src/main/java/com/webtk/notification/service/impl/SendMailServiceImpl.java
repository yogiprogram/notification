package com.webtk.notification.service.impl;

import com.webtk.notification.service.SendMailService;
import com.webtk.notification.service.SmtpFactory;
import lombok.extern.slf4j.Slf4j;
import message.SendMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
@Slf4j
public class SendMailServiceImpl implements SendMailService {

  @Autowired private SmtpFactory smtpFactory;

  @Value("${notification.smtpName}")
  private String smtpName;

  @Override
  public void createEmailWithAttachment(
      String to, String from, MultipartFile attachment, String subject, String bodyText) {
    smtpFactory.getSmtpFactory(smtpName).createMailAndSend(to, from, subject, bodyText, attachment);
  }

  @Override
  public void createEmailWithAttachmentFallback(RuntimeException e) {
    throw new IllegalArgumentException("Not Able to send email");
  }

  @Override
  public void createEmailWithAttachment(SendMessage consumerRecord) {
    smtpFactory.getSmtpFactory(smtpName).createMailAndSend(consumerRecord);
  }
}
