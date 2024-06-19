package com.microsoft.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServlet;

public class FilterServletPractice extends HttpServlet {
    @Override
    public void doGet (HttpServletRequest request, HttpServletResponse response) {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        try {
            PrintWriter out = response.getWriter();
            out.println("username: " + username);
            out.println("password: " + password);
        } catch (IOException e) {
            e.printStackTrace();
        }

        request.getServletContext();
        this.getServletContext();
        request.getSession().getServletContext();
    }

    @Override
    public void doPost (HttpServletRequest request, HttpServletResponse response) {
        doGet(request, response);
    }

}