<%@ page contentType="text/html; charset=UTF-8"%>
<%@ page import="java.util.Date"%>
<%@ page import="java.text.SimpleDateFormat"%>

<html lang="en">
<head>
    <title>practice the advanced usage of jsp</title>
    <meta charset="UTF-8"/>
    <link rel="stylesheet" type="text/css" href="styles/index.css"/>
</head>
<body>
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
</form>
<%
    request.setAttribute("name1", "felix");
    pageContext.setAttribute("name2", "felix");
    session.setAttribute("name3", "felix");
    application.setAttribute("name4", "felix");
%>
<%
    String name1 = (String) pageContext.findAttribute("name1");
    String name2 = (String) pageContext.findAttribute("name2");
    String name3 = (String) pageContext.findAttribute("name3");
    String name4 = (String) pageContext.findAttribute("name4");
    String name5 = (String) pageContext.findAttribute("name5");
%>
<p>
    Your name is: <%=name1%><br/>
    Your name is: <%=name2%><br/>
    Your name is: <%=name3%><br/>
    Your name is: <%=name4%><br/>
    EL expression name5: ${name5}
    Your name is: <%=name5%>
</p>
<p id="time">
    Current time:
    <%
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        out.println(dateFormat.format(new Date()));
    %>
</p>
</body>
</html>
