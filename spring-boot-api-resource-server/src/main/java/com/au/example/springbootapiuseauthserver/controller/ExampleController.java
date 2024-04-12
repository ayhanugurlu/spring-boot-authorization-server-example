package com.au.example.springbootapiuseauthserver.controller;


import com.au.example.springbootapiuseauthserver.service.ExampleService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

@Controller
@ResponseBody
public class ExampleController {

    private final ExampleService exampleService;

    public ExampleController(ExampleService exampleService) {
        this.exampleService = exampleService;
    }


    @GetMapping("/")
    public Map<String, String> getExampleData() {
        return exampleService.getExampleData();
    }
}
