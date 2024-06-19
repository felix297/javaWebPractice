package com.microsoft.filter;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.Filter;

public class CharacterEncodingFilter implements Filter {
    public void init (FilterConfig filterConfig) {
        System.out.println("Entering into the init method.");

    }

    public void doFilter (ServletRequest request, ServletResponse response, FilterChain chain) {
        System.out.println("entering into the doFilter method.");
        try {
            request.setCharacterEncoding("UTF-8");
            response.setCharacterEncoding("UTF-8");
            response.setContentType("text/html;charset=UTF-8");
        } catch (Exception e){
            e.printStackTrace();
        } finally {
            try {
                chain.doFilter(request, response);
                response.getWriter().println("If the username and password is got, then it get through the filter.");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public void destroy () {
        System.out.println("Entering into the destroy method.");
    }
}