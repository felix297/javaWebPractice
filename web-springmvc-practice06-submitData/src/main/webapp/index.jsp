<%@ page contentType="text/html; encoding=UTF-8" language="java"%>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>hello</title>
</head>
<body>
<h1 style="text-align: center; font: 30px consolas, sans-serif; color: green;">Hello!</h1>
<form style="text-align: center; font: 20px consolas, sans-serif;" method="post" action="${pageContext.request.contextPath}/encodingProblem">
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
</body>
</html>