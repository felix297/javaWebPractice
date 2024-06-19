<%@ page contentType="text/html; charset=UTF-8"%>

<html>
<head>
    <title>filter practice</title>
    <link rel="stylesheet" type="text/css" href="styles/index.css"/>
</head>
<body>
<h1>Hello!</h1>
<form method="post" action="${pageContext.request.contextPath}/filter">
    <p>
        <label for="username">username: </label> <input type="text" name="username" id="username"/>
    </p>
    <p>
        <label for="password">password: </label> <input type="password" name="password" id="password"/>
    </p>
    <p>
        <input type="submit" value="submit"/> &nbsp&nbsp&nbsp&nbsp <input type="reset" value="reset"/>
    </p>
</form>
</body>
</html>
