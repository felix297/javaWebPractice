package com.company.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.stereotype.Controller;

@Controller
public class ResultMapperPractice {

    @RequestMapping(value="/hello/{num1}/{num2}", method=RequestMethod.GET)
    public String sayHello (@PathVariable int num1, @PathVariable int num2, Model model) {
        model.addAttribute("result", num1 + num2);
        return "hello";
    }

    @RequestMapping("hello/{num1}/{str1}/{str}")
    public String sayHello2 (@PathVariable int num1, @PathVariable String str1, @PathVariable String str, Model model) {
        model.addAttribute("result", num1 + str1+ str);
        return "hello";
    }
}