package com.webtk.notification.service.impl;

import com.webtk.notification.service.SmtpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class SmtpFactory {

    @Autowired
    private ApplicationContext applicationContext;
    private String serviceImpl = "ServiceImpl";

    public SmtpService getSmtpFactory(String smtpName) {
        return (SmtpService) applicationContext.getBean(smtpName.concat(serviceImpl));
    }
}
