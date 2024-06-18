<%@ page contentType="text/html; charset=UTF-8" language="java" pageEncoding="UTF-8"%>
<%@ page import="java.util.Date" %>
<%@ page import="java.text.SimpleDateFormat"%>
<html lang="en">
<head>
    <title>jsp syntex</title>
    <meta charset="UTF-8">
    <link rel="stylesheet" type="text/css" href="styles/index.css"/>
</head>

<%!
    public void run() {
        System.out.println("this is a method created by jsp");
    }

%>


<body>
<%@ include file="page2.html"%>
<h1>Hello!</h1>
<form action="" method="post">
    <p>
        <label for="username">username: </label><input type="text" id="username" name="username"/>
    </p>
    <p>
        <label for="password">password: </label><input type="password" id="password" name="password"/>
    </p>
    <p>
        <input type="submit" value="submit"/> &nbsp&nbsp&nbsp&nbsp <input type="reset" value="reset"/>
    </p>
    <p>
        <%
            run();
        %>
    </p>
    <p>
        <%--this is a comment--%>
        <%request.setCharacterEncoding("UTF-8");%>
        <%response.setCharacterEncoding("UTF-8");%>
        <%= request.getParameter("username")%>
        <%= ":"%>
        <%= request.getParameter("password")%>
    </p>
    <p>
        Time now:
        <%
        Date date = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        out.println(dateFormat.format(date));
        %>
    </p>
    <p>
        Your IP address is: <%= request.getRemoteAddr()%>
    </p>
</form>
<%@ include file="page3.jsp"%>
</body>
</html>