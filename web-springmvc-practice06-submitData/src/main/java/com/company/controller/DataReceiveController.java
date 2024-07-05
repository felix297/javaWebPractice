package com.company.controller;

import com.company.pojo.User;
import org.springframework.ui.ModelMap;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.ui.Model;

@Controller
public class DataReceiveController {
    @RequestMapping("/receiveData1")
    public String receiveDate1 (String username, Model model) {
        model.addAttribute("msg", "username: " + username);
        return "receiveData";
    }

    @RequestMapping("/receiveData2")
    public ModelAndView receiveData2 (@RequestParam("username") String name, ModelAndView modelAndView) {
        modelAndView.setViewName("receiveData");
        modelAndView.addObject("msg", "username: " + name);
        return modelAndView;
    }

    @RequestMapping("/receiveData3")
    public String receiveData3 (User user, ModelMap modelMap) {
        modelMap.addAttribute("msg", user.toString());
        return "receiveData";
    }

    @RequestMapping("/encodingProblem")
    public ModelAndView encodingProblem (@RequestParam("username") String name, @RequestParam("password") String password) {
        ModelAndView modelAndView = new ModelAndView("encodingProblem");
        modelAndView.addObject("username", name);
        modelAndView.addObject("password", password);
        return modelAndView;
    }
}