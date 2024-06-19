<%@ page contentType="text/html; charset=UTF-8"%>
<%@ page import="java.util.Date"%>
<%@ page import="java.text.SimpleDateFormat"%>

<html>
<head>
    <title>application of filter</title>
    <link rel="stylesheet" type="text/css" href="../styles/login.css"/>
</head>
<body>
<h1>Hello!</h1>
<form method="post" action="${pageContext.request.contextPath}/login">
    <p><label for="username">username: </label><input type="text" id="username" name="username"/></p>
    <p><label for="password">password: </label><input type="password" id="password" name="password"/></p>
    <p><input type="submit" value="submit"/> &nbsp&nbsp&nbsp&nbsp <input type="reset" value="reset"/></p>
</form>

<p>
    <%
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        out.println(dateFormat.format(new Date()));
    %>
</p>
</body>
</html>
