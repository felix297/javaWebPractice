package com.microsoft;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.io.PrintWriter;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServlet;

public class SessionServletPractice extends HttpServlet {
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) {
        HttpSession session = request.getSession();
//        session.setMaxInactiveInterval(3);
        session.setAttribute("name", "felix'");
        try {
            PrintWriter out = response.getWriter();
            out.println("creation time: " + getTime(session.getCreationTime()));
            out.println("last access time: " + getTime(session.getLastAccessedTime()));
            out.println("is a new session? " + session.isNew());
            out.println("corresponding session id: " + session.getId());
        } catch (Exception e) {
            e.printStackTrace();
        }

//        session.invalidate();
    }

    @Override
    public void doPost (HttpServletRequest request, HttpServletResponse response) {
        doGet(request, response);
    }

    public String getTime (long time) {
        Date date = new Date(time);
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        return dateFormat.format(date);
    }
}