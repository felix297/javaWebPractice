package com.microsoft;

import java.io.IOException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServlet;

public class RedirectServlet extends HttpServlet {
    @Override
    public void doGet (HttpServletRequest request, HttpServletResponse response) {
        System.out.println("RedirectServlet");
        try {
            response.getWriter().println("Error");
//            response.sendRedirect("/practice15/error.html");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void doPost (HttpServletRequest request, HttpServletResponse response) {
        doGet(request, response);
    }

}