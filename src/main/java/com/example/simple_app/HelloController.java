package com.example.simple_app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HelloController {
    
    @GetMapping
    public String hello() {
        return "Hello from simple_app!";
    }
}
