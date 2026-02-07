package com.example.simple_app;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HelloController {
    
    @Value("${environment.variable1}")
    private String envVar1;

    @Value("${environment.variable2}")
    private String envVar2;

    @GetMapping
    public String hello() {
        return "Hello from simple_app!" +envVar1 + " " + envVar2;
    }
}
