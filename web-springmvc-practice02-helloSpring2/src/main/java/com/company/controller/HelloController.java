package com.company.controller;

import org.springframework.web.servlet.ModelAndView;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.mvc.Controller;

public class HelloController implements Controller {
    @Override
    public ModelAndView handleRequest (HttpServletRequest request, HttpServletResponse response) {
        ModelAndView modelAndView = new ModelAndView("hello");
        modelAndView.addObject("msg", "Hello! SpringMVC!");
        return modelAndView;
    }
}