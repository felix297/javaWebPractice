<%@ page contentType="text/html; charset=UTF-8"%>
<%@ page import="java.util.Date"%>
<%@ page import="java.text.SimpleDateFormat"%>
<%@ page isELIgnored="false" %>
<%--<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>--%>

<html>
<head>
    <title>practice jsp and jstl and el</title>
    <meta charset="UTF-8"/>
    <link rel="stylesheet" type="text/css" href="styles/index.css"/>
</head>
<body>
<%--<%@ include file="test.jsp"%>--%>
<h1>Hello!</h1>
<form>
    <p>
        <label for="username">username: </label> <input id="username" type="text" name="username"/>
    </p>
    <p>
        <label for="password">password: </label> <input id="password" type="password" name="password"/>
    </p>
    <p>
        <input type="submit" value="submit"/> &nbsp;&nbsp;&nbsp;&nbsp; <input type="reset" value="reset"/>
    </p>
</form>
<p>
    <%
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String time = dateFormat.format(new Date());
        request.setAttribute("time", time);
    %>
    Current time: ${time}
</p>
<%--<jsp:include page="test.jsp"/>--%>

<p>
<h1>test c:if</h1>
<c:if test="${param.username == 'felix'}">
    <c:out value="You are admin"/>
</c:if>
<c:if test="${param.username != 'felix'}">
    <c:out value="Welcome!"/>
</c:if>
</p>
</body>
</html>

