package com.microsoft.listener;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

public class ListenerPractice implements HttpSessionListener {
    @Override
    public void sessionCreated(HttpSessionEvent sessionEvent) {
        System.out.println("Session created");
        ServletContext servletContext = sessionEvent.getSession().getServletContext();

        Integer onlineCount = (Integer) servletContext.getAttribute("onlineCount");
        if (onlineCount == null) {
            onlineCount = 1;
        } else {
            onlineCount++;
        }

        servletContext.setAttribute("onlineCount", onlineCount);
        System.out.println("Online Count (after creation): " + onlineCount);
    }

    @Override
    public void sessionDestroyed(HttpSessionEvent sessionEvent) {
        System.out.println("Session destroyed");
        ServletContext servletContext = sessionEvent.getSession().getServletContext();

        Integer onlineCount = (Integer) servletContext.getAttribute("onlineCount");
        if (onlineCount != null && onlineCount > 0) {
            onlineCount--;
        }

        servletContext.setAttribute("onlineCount", onlineCount);
        System.out.println("Online Count (after destruction): " + onlineCount);
    }
}
