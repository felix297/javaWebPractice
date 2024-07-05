package com.company.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

@Controller
public class HelloController {
    @RequestMapping("/hello")
    public String sayHello (Model model) {
        model.addAttribute("msg", "Hello! SpringMVC!");
        return "hello";
    }
}