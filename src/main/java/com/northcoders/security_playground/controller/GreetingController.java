package com.northcoders.security_playground.controller;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.oauth2.core.user.OAuth2User;
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
        OAuth2User userDetails = (OAuth2User) SecurityContextHolder.getContext()
                .getAuthentication().getPrincipal();
        return "Hi, "+ userDetails.getAttribute("name")+" nice to meet you!";
    }
}
