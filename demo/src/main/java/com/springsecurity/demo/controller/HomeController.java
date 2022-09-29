package com.springsecurity.demo.controller;

import java.security.Principal;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    
    @GetMapping
    public String Home (Principal principal) {
        return "Hello " + principal.getName();
    }
}
