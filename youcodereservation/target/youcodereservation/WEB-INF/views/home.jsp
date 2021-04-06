<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home</title>
        <link href="${pageContext.request.contextPath}/resources/welcome.css" rel="stylesheet" />
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
        <link href="https://cdnjs.cloudflare.com/ajax/libs/mdbootstrap/4.19.1/css/mdb.min.css" rel="stylesheet">
        <link
                rel="stylesheet"
                href="https://cdnjs.cloudflare.com/ajax/libs/animate.css/4.1.1/animate.min.css"
        />
    </head>
    <body class="container">
    <h1 class="animate__animated animate__backInDown"><span class="animate__animated animate__bounce ">YouCode</span> reservation application</h1>
        <%--<p>Reserve your place !</p>--%>
        <div class="links">
            <a class="btn btn-primary btn-rounded  animate__animated animate__backInLeft animate__delay-1s" href="${pageContext.request.contextPath}/register">Register</a>
            <a class="btn btn-success btn-rounded  animate__animated animate__backInRight animate__delay-1s" href="${pageContext.request.contextPath}/login">Login</a>
<%--
            <a href="${pageContext.request.contextPath}/checking">Checking</a>
--%>
        </div>
    </body>
</html>
