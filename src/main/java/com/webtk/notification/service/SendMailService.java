package com.webtk.notification.service;

import com.webtk.notification.exception.MailException;
import message.SendMessage;
import org.springframework.retry.annotation.Backoff;
import org.springframework.retry.annotation.Recover;
import org.springframework.retry.annotation.Retryable;
import org.springframework.web.multipart.MultipartFile;

public interface SendMailService {

    @Retryable(
            value = {MailException.class},
            maxAttemptsExpression = "${notification.maxAttemptsExpression}",
            backoff = @Backoff(maxDelayExpression = "${notification.maxDelayExpression}"))
    void createEmailWithAttachment(
            String to, String from, MultipartFile attachment, String subject, String bodyText);

    @Recover
    void createEmailWithAttachmentFallback(RuntimeException e);

    void createEmailWithAttachment(SendMessage consumerRecord);
}
