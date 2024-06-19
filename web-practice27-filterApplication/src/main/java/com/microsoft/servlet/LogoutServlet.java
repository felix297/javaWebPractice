package com.microsoft.servlet;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServlet;
import java.io.IOException;

public class LogoutServlet extends HttpServlet {
    @Override
    public void doGet (HttpServletRequest request, HttpServletResponse response) throws IOException {
        request.getSession().removeAttribute("UID");
        response.sendRedirect(getServletContext().getContextPath()+"/jsp/login.jsp");
    }

    @Override
    public void doPost (HttpServletRequest request, HttpServletResponse response) throws IOException {
        doGet(request, response);
    }
}