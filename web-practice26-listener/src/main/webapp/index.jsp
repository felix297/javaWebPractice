<%@ page contentType="text/html; UTF-8"%>
<%@ page import="java.util.Date"%>
<%@ page import="java.text.SimpleDateFormat"%>
<html>
<head>
    <title>practice listener</title>
    <link rel="stylesheet" type="text/css" href="styles/index.css"/>
</head>
<body>
<h1>Hello!</h1>
<form method="post" action="${pageContext.request.contextPath}/listener">
    <p>
        <label for="username">username: </label> <input type="text" name="username" id="username"/>
    </p>
    <p>
        <label for="password">password: </label> <input type="password" name="password" id="password"/>
    </p>
    <p>
        <input type="submit" value="submit"/> &nbsp&nbsp&nbsp&nbsp<input type="reset" value="reset"/>
    </p>

    <p>
        Current time:
        <%
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
            out.println(dateFormat.format(new Date()));
        %>
    </p>
    <p>
        current online number:
        <%
            out.println(pageContext.getServletContext().getAttribute("onlineCount"));
        %>
    </p>
</form>
</body>
</html>
