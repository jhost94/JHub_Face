package com.jhost.template.Face.controller.rest.v1;

import com.jhost.template.Face.config.Constants;
import com.jhost.template.Face.service.TestService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Locale;

@RestController
@RequestMapping(value = Constants.APIPaths.V1, produces = Constants.HttpHeaders.ContentType.APPLICATION_JSON)
public class TestController {

    private final TestService testService;

    public TestController(TestService testService) {
        this.testService = testService;
    }

    @GetMapping
    public String test(final Locale locale){
        return testService.getTestMessage(locale);
    }
}
