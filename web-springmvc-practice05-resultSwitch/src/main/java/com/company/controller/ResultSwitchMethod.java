package com.company.controller;

import java.io.IOException;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.ui.Model;
//import org.springframework.web.servlet.mvc.Controller;
import org.springframework.stereotype.Controller;

@Controller
public class ResultSwitchMethod {
    // result switch method 1-1: through model and view
//    @Override
//    public ModelAndView handleRequest (HttpServletRequest request, HttpServletResponse response) {
//        ModelAndView modelAndView = new ModelAndView("res");
//        modelAndView.addObject("msg", "result switch method 1-1: through model and view");
//        return modelAndView;
//    }

//     result switch method 1-2: through annotation
//    @RequestMapping("/method1-2")
//    public String method2 (Model model) {
//        model.addAttribute("msg", "result switch method 1-2: through annotation");
//        return "res";
//    }

    // result switch method 2: through HttpServletResponse
    @RequestMapping("/method2-1")
    public void method2 (HttpServletRequest request, HttpServletResponse response) {

        try {
            response.getWriter().println("response writer!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @RequestMapping("/method2-2")
    public void method22 (HttpServletRequest request, HttpServletResponse response) {
        try {
            response.sendRedirect(request.getContextPath() + "/index.jsp");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @RequestMapping("/method2-3")
    public void method23 (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("msg", "request switch method 2-3: through request dispatcher");
        request.getRequestDispatcher("WEB-INF/jsp/res.jsp").forward(request, response);
    }


    @RequestMapping("/withView1")
    public String method3 (Model medel) {
        medel.addAttribute("msg" , "with view, request dispatcher");
        return "res";
    }

    @RequestMapping("/withView2")
    public String method31 () {
        return "redirect:/index.jsp";
    }

    @RequestMapping("/withoutView1")
    public String method4 (Model model) {
        model.addAttribute("msg", "without view, request dispatcher");
        return "/WEB-INF/jsp/res.jsp";
    }

    @RequestMapping("/withoutView2")
    public String method42 () {
        return "redirect:/index.jsp";
    }
}