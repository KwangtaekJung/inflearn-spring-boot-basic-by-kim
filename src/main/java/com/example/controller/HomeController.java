package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")  // static/index.html 보다 우선
    public String home() {
        return "home";
    }
}
