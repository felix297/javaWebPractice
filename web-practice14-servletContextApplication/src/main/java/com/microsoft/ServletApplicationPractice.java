package com.microsoft;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServlet;

public class ServletApplicationPractice extends HttpServlet {
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) {
        ServletContext servletContext = this.getServletContext();
        System.out.println("===========servlet context 1 ==========");
        System.out.println(servletContext.getInitParameter("felix"));
        System.out.println(servletContext.hashCode());
        System.out.println("===========start dispatch...============");
        RequestDispatcher requestDispatcher = servletContext.getRequestDispatcher("/application2");
        try {
            requestDispatcher.forward(request, response);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) {
        doGet(request, response);
    }
}