package com.jhost.template.Face.service.meta;

import org.springframework.context.MessageSource;
import org.springframework.stereotype.Service;

import java.util.Locale;

@Service
public class MessageService {

    private final MessageSource messageSource;

    public MessageService(MessageSource messageSource) {
        this.messageSource = messageSource;
    }

    public String getMessage(Constants.MessagePaths paths, Locale locale) {
        return messageSource.getMessage(paths.getMessage(), null, locale);
    }
}
