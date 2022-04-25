package com.jhost.template.Face.service;

import com.jhost.template.Face.config.Constants;
import com.jhost.template.Face.service.meta.MessageService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Locale;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

class TestServiceTest {

    TestService testService;

    @Mock
    MessageService messageService;

    @Mock
    Locale locale;

    @Mock
    Constants.MessagePaths messagePath;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);

        testService = new TestService(messageService);
    }

    @Test
    void getTestMessage() {
        String textValue = "TEST";

        when(messageService.getMessage(messagePath, locale)).thenReturn(textValue);

        assertEquals(messageService.getMessage(messagePath, locale), textValue);
    }
}