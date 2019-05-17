package com.webtk.notification.service.impl;

import com.webtk.notification.service.SmtpService;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@ConditionalOnProperty(
        name = "notification.smtpName",
        havingValue = "default")
@Component
public class DefaultSMTPServiceImpl implements SmtpService {

}
