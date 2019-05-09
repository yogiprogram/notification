package com.webtk.notification.controller;

import com.webtk.notification.api.SendMailApi;
import com.webtk.notification.kafka.SendEmailProducer;
import com.webtk.notification.service.SendMailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
@Validated
public class SendMailController implements SendMailApi {
  @Autowired private SendMailService sendMailService;

  @Override
  public ResponseEntity<Void> createEmailWithAttachment(
      String to, String from, String subject, MultipartFile file, String bodyText) {
    sendMailService.createEmailWithAttachment(to, from, file, subject, bodyText);
    return new ResponseEntity<>(HttpStatus.OK);
  }
}
