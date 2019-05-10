package com.webtk.notification.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.BAD_REQUEST)
public class MailException extends RuntimeException {

    public MailException() {
        super();
    }

    public MailException(String message, Throwable cause) {
        super(message, cause);
    }

    public MailException(String message) {
        super(message);
    }

    public MailException(Throwable cause) {
        super(cause);
    }
}
