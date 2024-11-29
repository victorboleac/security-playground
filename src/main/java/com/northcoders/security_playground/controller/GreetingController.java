package com.northcoders.security_playground.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class GreetingController {

    @GetMapping("/open/greeting")
    public String greeting() {
        return "Hello, Welcome to our API";
    }
    @GetMapping("/protected/greeting")
    public String protectedGreeting() {
        return "Hi, nice to meet you!";
    }
}
