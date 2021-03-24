<%--
  Created by IntelliJ IDEA.
  User: Hamza
  Date: 16/03/2021
  Time: 12:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Registration</title>
    <link rel="stylesheet" type="text/css"
          href="${ pageContext.request.contextPath}/resources/style.css">
</head>
<body>
        <%--<h1>Registration Form</h1>--%>

        <div class="wrapper" style="background-image: url('${ pageContext.request.contextPath }/resources/images/bg.jpg');">
            <div class="inner" style="background-image: url('${ pageContext.request.contextPath }/resources/images/registration-form-2.jpg');">
                <form action="Register" method="post">
                    <h3>Registration Form</h3>
                    <div class="form-group">
                        <div class="form-wrapper">
                            <label> prenom</label>
                            <input type="text" class="input form-control" name="prenom"
                                   placeholder="prenom" />
                        </div>
                        <div class="form-wrapper">
                            <label>nom</label>
                            <input type="text" class="input form-control" name="nom" placeholder="nom" />
                        </div>
                    </div>
                    <div class="form-wrapper">
                        <label>email </label>
                        <input type="text" class="input form-control" name="email" placeholder="EMAIL" />
                    </div>
                    <div class="form-wrapper">
                        <label>Password</label>
                        <input type="password" class="input form-control" name="password" placeholder="password" />
                    </div>
                    <%--<div class="form-wrapper">
                        <label>Role</label>
                        <input type="role" class="input" name="role_id" placeholder="roleid" />
                    </div>--%>
                    <%--<div class="form-wrapper">
                        <label for="">Confirm Password</label>
                        <input type="password" class="form-control" name="password">
                    </div>--%>

                    <button type="submit" value="register">Register Now</button>
                </form>
            </div>
        </div>

</body>
</html>
