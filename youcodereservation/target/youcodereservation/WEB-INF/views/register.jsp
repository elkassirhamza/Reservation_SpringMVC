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
                <form action="">
                    <h3>Registration Form</h3>
                    <div class="form-group">
                        <div class="form-wrapper">
                            <label for="">First Name</label>
                            <input type="text" class="form-control">
                        </div>
                        <div class="form-wrapper">
                            <label for="">Last Name</label>
                            <input type="text" class="form-control">
                        </div>
                    </div>
                    <div class="form-wrapper">
                        <label for="">Email</label>
                        <input type="text" class="form-control">
                    </div>
                    <div class="form-wrapper">
                        <label for="">Password</label>
                        <input type="password" class="form-control">
                    </div>
                    <div class="form-wrapper">
                        <label for="">Confirm Password</label>
                        <input type="password" class="form-control">
                    </div>

                    <button>Register Now</button>
                </form>
            </div>
        </div>

</body>
</html>
