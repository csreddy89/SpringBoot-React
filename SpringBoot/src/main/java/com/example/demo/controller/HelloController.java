
package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Map;
import org.springframework.web.bind.annotation.CrossOrigin;


@RestController
@RequestMapping("/")
@CrossOrigin(origins = "http://localhost:3000")
public class HelloController {
    
    @GetMapping("/")
    public Map<String, String> sayHello() {
        return Map.of("message", "Hello from Spring Boot!");
    }
}