package com.example.spring_boot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    // Mapping for "/home"
    @GetMapping("/home")
    public String home() {
        return "Welcome to the Home Page!";
    }

    // Mapping for "/api/v1/resource"
    @RequestMapping("/api/v1/resource")
    public String resource() {
        return "Here is your resource!";
    }
}
