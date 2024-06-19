package com.microsoft.servlet;

import javax.servlet.http.HttpSession;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServlet;

public class LoginServlet extends HttpServlet {
    @Override
    public void doGet (HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
        if (request.getParameter("username").equals("admin")) {
            HttpSession session = request.getSession();
            session.setAttribute("UID", session.getId());
            request.getRequestDispatcher("/jsp/success.jsp").forward(request, response);
        } else {
            request.getRequestDispatcher("/jsp/error.jsp").forward(request, response);
        }



    }

    @Override
    public void doPost (HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        doGet(request, response);
    }
}