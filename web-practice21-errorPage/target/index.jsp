<%@ page contentType="text/html; charset=UTF-8"%>
<%@ page import="java.util.Date"%>
<%@ page import="java.text.SimpleDateFormat"%>
<html lang="en">
<head>
    <title>error page practice</title>
    <meta charset="UTF-8"/>
    <link rel="stylesheet" type="text/css" href="styles/index.css"/>
</head>
<body>
<h1>Hello!</h1>
<form action="" method="post">
    <p>
        <label for="username">username: </label> <input type="text" name="username" id="username"/>
    </p>
    <p>
        <label for="password">password: </label><input type="password" id="password" name="password"/>
    </p>
    <p>
        <input type="submit" value="submit"/> &nbsp&nbsp&nbsp&nbsp <input type="reset" value="reset"/>
    </p>
</form>

<p>
    Current time:
    <%
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        out.println(dateFormat.format(new Date()))
    %>
<p>
</body>
</html>
