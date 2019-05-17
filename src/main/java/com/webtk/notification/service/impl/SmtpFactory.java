package com.webtk.notification.service.impl;

import com.webtk.notification.service.SmtpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SmtpFactory {

    @Autowired
    private SmtpService smtpService;

    public SmtpService getSmtpFactory() {
        return smtpService;
    }
}
