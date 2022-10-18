package com.jhost.template.Face.controller.rest.v1;

import com.jhost.template.Face.config.constant.APIPaths;
import com.jhost.template.Face.config.constant.HttpConstants;
import com.jhost.template.Face.service.TestService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Locale;

@RestController
@RequestMapping(value = APIPaths.V1, produces = HttpConstants.ContentType.APPLICATION_JSON)
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
