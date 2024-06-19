package com.microsoft.filter;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class LoginFilter2 implements Filter {
    @Override
    public void init (FilterConfig filterconfig) {
        System.out.println("init");
    }

    @Override
    public void doFilter (ServletRequest request, ServletResponse response, FilterChain chain) throws ServletException, IOException {
        System.out.println("doFilter");
        HttpServletRequest req = (HttpServletRequest) request;
        HttpServletResponse res = (HttpServletResponse) response;

        if (req.getSession().getAttribute("UID") == null) {
            res.sendRedirect(request.getServletContext().getContextPath() + "/jsp/login.jsp");
            return;
        }

        chain.doFilter(request, response);
    }

    @Override
    public void destroy () {
        System.out.println("destroy");
    }
}