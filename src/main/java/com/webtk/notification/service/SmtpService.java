package com.webtk.notification.service;

import message.SendMessage;
import org.springframework.web.multipart.MultipartFile;

public interface SmtpService {

    default void createMailAndSend(
            String to, String from, String subject, String bodyText, MultipartFile attachment) {
    }

    default void createMailAndSend(SendMessage consumerRecord) {
    }
}
