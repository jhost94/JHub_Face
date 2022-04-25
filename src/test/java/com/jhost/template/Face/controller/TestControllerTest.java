package com.jhost.template.Face.controller;

import com.jhost.template.Face.controller.rest.v1.TestController;
import com.jhost.template.Face.service.TestService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import java.util.Locale;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

class TestControllerTest {

    TestController testController;

    @Mock
    TestService testService;

    @Mock
    Locale locale;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);

        testController = new TestController(testService);
    }

    @Test
    public void test1() {
        String ptMSG = "PT test message";

        when(testService.getTestMessage(locale)).thenReturn(ptMSG);

        assertEquals(testController.test(locale), ptMSG);
    }
}