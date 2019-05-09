package com.webtk.notification.service.impl;

import com.webtk.notification.service.SmtpFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class SmtpFactoryImpl implements SmtpFactory {

  @Autowired private ApplicationContext applicationContext;
  private String serviceImpl = "ServiceImpl";

  @Override
  public SmtpFactory getSmtpFactory(String smtpName) {
    return (SmtpFactory) applicationContext.getBean(smtpName.concat(serviceImpl));
  }
}
