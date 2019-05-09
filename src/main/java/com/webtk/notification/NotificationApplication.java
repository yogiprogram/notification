package com.webtk.notification;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.retry.annotation.EnableRetry;

@SpringBootApplication
@EnableRetry
@EnableKafka
public class NotificationApplication {

  public static void main(String[] args) {

    SpringApplication.run(NotificationApplication.class, args);
  }
}
