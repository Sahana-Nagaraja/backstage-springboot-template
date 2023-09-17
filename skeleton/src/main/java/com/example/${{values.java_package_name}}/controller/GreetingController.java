package com.example.backstage.${{values.java_package_name}}.controller;

import com.example.backstage.${{values.java_package_name}}.service.GreetingService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    GreetingService greetingService;

    public GreetingController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    @GetMapping("/hello")
    public String greeting() {
        return greetingService.greet();
    }

}
