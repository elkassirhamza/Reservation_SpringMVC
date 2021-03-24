<%--
  Created by IntelliJ IDEA.
  User: Hamza
  Date: 18/03/2021
  Time: 23:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" type="text/css"
          href="${pageContext.request.contextPath}/resources/login.css">
</head>
<body>
<div class="login">
    <h1>Login</h1>

        <div class='login-box'>
            <form action="Login" method="post">
                <p>Email</p>
                <input type="email" name="email" placeholder="email">
                <p>Password</p>

                <input type="password" name="password" placeholder=" password">
                <input type="submit" name="submit" value="login">
                <%--<button type="submit" class="btn btn-primary btn-block btn-large">Login</button>--%>
            </form>

        </div>

</div>
</body>
</html>
