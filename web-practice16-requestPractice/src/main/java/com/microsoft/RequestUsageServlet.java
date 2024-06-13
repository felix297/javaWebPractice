package com.microsoft;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServlet;

public class RequestUsageServlet extends HttpServlet {
    @Override
    public void doGet (HttpServletRequest request, HttpServletResponse response) {
        try {
            request.setCharacterEncoding("UTF-8");
            response.setCharacterEncoding("UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }


        String username = request.getParameter("username");
        String passwd = request.getParameter("passwd");
        String[] hobby = request.getParameterValues("hobby");

        try {
            PrintWriter printWriter = response.getWriter();
            printWriter.println(username);
            printWriter.println(passwd);
            for (int i = 0; i < hobby.length; i++)  {
                printWriter.println(hobby[i]);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void doPost (HttpServletRequest request, HttpServletResponse response) {
        doGet(request, response);
    }

}