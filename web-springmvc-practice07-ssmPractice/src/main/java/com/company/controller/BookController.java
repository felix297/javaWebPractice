package com.company.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import com.company.service.BookServiceImpl;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.ui.Model;

@Controller
@RequestMapping("/book")
public class BookController {

    @Autowired
    @Qualifier("bookServiceImpl")
    private BookServiceImpl bookService;

    @RequestMapping("/all-book")
    public String showAllBook (Model model) {
        model.addAttribute("bookList", bookService.selectAll());
        return "bookList";
    }
}