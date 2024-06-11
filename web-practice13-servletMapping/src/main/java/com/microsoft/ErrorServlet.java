package com.microsoft;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ErrorServlet extends HttpServlet {
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) {
        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");
        try {
            PrintWriter out = response.getWriter();
            out.println("<html lang='en'>");
            out.println("<head>");
            out.println("<title>");
            out.println("error page");
            out.println("</title>");
            out.println("<meta charset='UTF-8'/>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1 color='red' font-family='consolas, sans-serif'>");
            out.println("Page Not Found");
            out.println("</h1>");
            out.println("</body>");
            out.println("<html>");

        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) {
        doGet(request, response);
    }
}
