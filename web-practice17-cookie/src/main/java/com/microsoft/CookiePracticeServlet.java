package com.microsoft;

import java.io.PrintWriter;
import org.junit.jupiter.api.Test;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServlet;

public class CookiePracticeServlet extends HttpServlet {
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws UnsupportedEncodingException {
        response.setContentType("text/html");
        try {
            PrintWriter out = response.getWriter();
            Cookie[] cookies = request.getCookies();
            System.out.println(cookies.length);
            boolean findLastLoginTime = true; // 用来处理cookie里面没有lastLoginTime的情况，因为可能以前访问你的服务器，一些应用或插件留下了留下了cookie，但是当时可没有设置“上次访问时间”，当然，用户一般情况下没有访问过你的服务器，就肯定他的浏览器在你的站点的cookie肯定是一个没有的，只有你发给他了才有，所以一般用null判断也可以。
            if (cookies != null) {
                for (Cookie ele : cookies) {
                    System.out.println(ele.getName());
                    if (ele.getName().equals("lastLoginTime")) {
                        String decodedValue = URLDecoder.decode(ele.getValue(), StandardCharsets.UTF_8.toString());
                        out.println("<html lang='en'>");
                        out.println("<head>");
                        out.println("<title>login time</title>");
                        out.println("</head>");
                        out.println("<body>");
                        out.println("<h1>" + decodedValue + "</h1>");
                        out.println("</body>");
                        out.println("</html>");
                        findLastLoginTime = false;
                        break;
                    }
                }
            }

            if (findLastLoginTime) {
                    out.println("<html lang='en'>");
                    out.println("<head>");
                    out.println("<title>login time</title>");
                    out.println("</head>");
                    out.println("<body>");
                    out.println("<h1>you come our site for the first time</h1>");
                    out.println("</body>");
                    out.println("</html>");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        Date date = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh-mm-ss");
        String time = URLEncoder.encode(dateFormat.format(date), StandardCharsets.UTF_8.toString());
        Cookie cookieLastLoginTime = new Cookie("lastLoginTime", time);
        response.addCookie(cookieLastLoginTime);
    }

    @Override
    public void doPost (HttpServletRequest request, HttpServletResponse response) throws UnsupportedEncodingException {
        doGet(request, response);
    }


    @Test
    public void test () {
        System.out.println(Calendar.getInstance().getTime());
    }
}