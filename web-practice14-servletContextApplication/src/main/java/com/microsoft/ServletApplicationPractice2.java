package com.microsoft;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class ServletApplicationPractice2 extends HttpServlet {
    @Override
    public void doGet (HttpServletRequest request, HttpServletResponse response) {
        ServletContext servletContext = this.getServletContext();
        System.out.println("=============servlet context 2===============");
        System.out.println(servletContext.getInitParameter("felix"));
        System.out.println(servletContext.hashCode());

    }

    @Override
    public void doPost (HttpServletRequest request, HttpServletResponse response) {
        doGet(request, response);
    }

}