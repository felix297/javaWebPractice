package com.microsoft.filter;

import javax.servlet.FilterChain;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.FilterConfig;
import javax.servlet.Filter;

public class ListenerFilter implements Filter {
    @Override
    public void init (FilterConfig filterConfig) {
        System.out.println("init");

    }

    @Override
    public void doFilter (ServletRequest request, ServletResponse response, FilterChain chain) {
        System.out.println("doFilter");
        try {
            request.setCharacterEncoding("UTF-8");
            response.setCharacterEncoding("UTF-8");
            response.setContentType("text/html; charset=UTF-8");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void destroy () {
        System.out.println("destroy");
    }
}
