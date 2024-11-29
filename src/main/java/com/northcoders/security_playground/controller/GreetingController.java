package com.northcoders.security_playground.controller;
import com.northcoders.security_playground.model.Users;
import com.northcoders.security_playground.service.userManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class GreetingController {

    @Autowired
    userManagerService userManager;

    @GetMapping("/open/greeting")
    public String greeting() {
        return "Hello, Welcome to our API";
    }
    @GetMapping("/protected/greeting")
    public Users protectedGreeting() {
        OAuth2User userDetails = (OAuth2User) SecurityContextHolder.getContext()
                .getAuthentication().getPrincipal();
        String id = userDetails.getName();
        String name = userDetails.getAttribute("name");
        String gitUsername = userDetails.getAttribute("login");
        Users userF = new Users(Long.parseLong(id), name, gitUsername);
        Users newUser = userManager.addUser(userF);
        return new ResponseEntity<>(newUser, HttpStatus.OK).getBody();
    }
}
