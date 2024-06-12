package com.microsoft;

import java.io.IOException;
import java.util.Properties;
import java.io.InputStream;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServlet;

public class ServletApplicationPractice3 extends HttpServlet {
    @Override
    public void doGet (HttpServletRequest request, HttpServletResponse response) throws IOException{
        ServletContext servletContext = this.getServletContext();

        // method 1
        InputStream input = servletContext.getResourceAsStream("WEB-INF/classes/db.properties");
        if (input != null) {
            Properties properties = new Properties();
            properties.load(input);
            response.getWriter().println("by servlet context: username="+ properties.getProperty("username"));
        } else {
            response.getWriter().println("resource not found!");
        }

        // method2
        InputStream input2 = getClass().getClassLoader().getResourceAsStream("db.properties");
        if (input2 != null) {
            Properties properties2 = new Properties();
            properties2.load(input2);
            properties2.getProperty("password");
            response.getWriter().println("by class loader: password="+properties2.getProperty("password"));
        } else {
            response.getWriter().println("resource not found!");
        }


    }

    @Override
    public void doPost (HttpServletRequest request, HttpServletResponse response) throws IOException{
        doGet(request, response);
    }

}