package com.microsoft;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Hello extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) {
        try {
            response.setCharacterEncoding("utf-8");
            response.setContentType("text/html");
            PrintWriter out = response.getWriter();
            out.println("<html lang=\"en\">");
            out.println("<head>");
            out.println("<meta charset=\"UTF=8\">");
            out.println("<title>");
            out.println("Hello, Servlet!");
            out.println("</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>");
            out.println("你好！Servlet!");
            out.println("</h1>");
            out.println("</body>");
            out.println("</html>");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
