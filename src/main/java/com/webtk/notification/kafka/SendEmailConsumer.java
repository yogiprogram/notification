package com.webtk.notification.kafka;

import com.webtk.notification.service.SendMailService;
import message.SendMessage;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.config.KafkaListenerEndpointRegistry;
import org.springframework.stereotype.Component;

@Component
public class SendEmailConsumer {

    private final KafkaListenerEndpointRegistry registry;
    private SendMailService sendMailService;

    @Value("${notification.kafka.sendmessage.records}")
    private Integer numRecords;

    public SendEmailConsumer(
            KafkaListenerEndpointRegistry registry, SendMailService sendMailService) {
        this.registry = registry;
        this.sendMailService = sendMailService;
    }

    @KafkaListener(topics = {"${notification.kafka.sendmessage.topic}"})
    public void receive(SendMessage consumerRecord) {
        sendMailService.createEmailWithAttachment(consumerRecord);
    }
}
