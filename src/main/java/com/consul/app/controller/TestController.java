package com.consul.app.controller;

import com.consul.app.config.DataConfig;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/tests")
public class TestController {

    private final DataConfig dataConfig;
    public TestController(DataConfig dataConfig) {
        this.dataConfig = dataConfig;
    }

    @Value("${data.url}")
    private String testData;

    @GetMapping
    public String test() {
        return dataConfig.getUrl();
    }

    @GetMapping("value")
    public String testValue() {
        return testData;
    }
}
