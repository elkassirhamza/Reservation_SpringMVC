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
                <p class='txt'>Email</p>
                <input type="email" name="email" placeholder="email" required>
                <p class='txt'>Password</p>

                <input type="password" name="password" placeholder=" password" required>
                <button type="submit" name="submit" value="login" class="btn btn-primary btn-block btn-large">Login</button>
                <%--<input class='loginn'type="submit" name="submit" value="login">--%>
                <a href='register'><p>Not a member? <span>Sign Up</span></p></a>

            </form>

        </div>

</div>
</body>
</html>
