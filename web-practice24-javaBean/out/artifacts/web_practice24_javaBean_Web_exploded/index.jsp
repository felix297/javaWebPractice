<%@ page contentType="text/html; charset=UTF-8"%>
<html>
<head>
    <title>use java bean</title>
    <link rel="stylesheet" type="text/css" href="index.css"/>
</head>
<body>
<h1>Hello!</h1>
<form>
    <p>
        <label for="username">username: </label> <input type="text" id="username" name="username"/>
    </p>
    <p>
        <label for="password">password: </label> <input type="password" id="password" name="password"/>
    </p>
    <p>
        <input type="submit" value="submit"> &nbsp&nbsp&nbsp&nbsp <input type="reset" value="reset"/>
    </p>
</form>

<jsp:useBean id="felix" class="com.microsoft.Student">
    <jsp:setProperty name="felix" property="stuId" value="456789"/>
    <jsp:setProperty name="felix" property="name" value="felix luo"/>
    <jsp:setProperty name="felix" property="age" value="10"/>
    <jsp:setProperty name="felix" property="phone" value="1234567"/>
</jsp:useBean>

<p>

    Info of felix luo: <br/>
    <table style="border: solid; margin: 0 auto;" >
        <tr style="border: solid;" >
            <th>name</th>
            <th>student id</th>
            <th>age</th>
            <th>phone</th>
        </tr>
        <tr style="border: solid;" >
            <td><jsp:getProperty name="felix" property="stuId"/></td>
            <td><jsp:getProperty name="felix" property="name"/></td>
            <td><jsp:getProperty name="felix" property="age"/></td>
            <td><jsp:getProperty name="felix" property="phone"/></td>
        </tr>
    </table>
<%--    <br/>--%>
<%--    <jsp:getProperty name="felix" property="name"/><br/>--%>
<%--    <jsp:getProperty name="felix" property="age"/><br/>--%>
<%--    <jsp:getProperty name="felix" property="phone"/><br/>--%>
</p>
</body>
</html>
