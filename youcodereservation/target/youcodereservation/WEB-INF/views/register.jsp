<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">

</head>
<body>
        <%--<h1>Registration Form</h1>--%>

        <div class="wrapper" style="background-image: url('${ pageContext.request.contextPath }/resources/images/bg.jpg');">
            <div class="inner" <%--style="background-image: url('${ pageContext.request.contextPath }/resources/images/registration-form-2.jpg');"--%>>
                <c:if test="${!(msg == null)}" var="test">
                    <div class="alert alert-success aler" role="alert">
                        <p class="text-success ml-auto"><c:out value="${msg}"></c:out><a href="login"> Click me for login</a></p>
                    </div>
                </c:if>
                <form action="Register" method="post">
                    <h3>Registration Form</h3>
                    <div class="form-group">
                        <div class="form-wrapper">
                            <label> prenom</label>
                            <input type="text" class="input form-control" name="prenom"
                                   placeholder="prenom" required/>
                        </div>
                        <div class="form-wrapper">
                            <label>nom</label>
                            <input type="text" class="input form-control" name="nom" placeholder="nom" required/>
                        </div>
                    </div>
                    <div class="form-wrapper">
                        <label>email </label>
                        <input type="text" class="input form-control" name="email" placeholder="EMAIL" required />
                    </div>
                    <div class="form-wrapper">
                        <label>Password</label>
                        <input type="password" class="input form-control" name="password" placeholder="password" pattern="(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{8,}" title="Must contain at least one number and one uppercase and lowercase letter, and at least 8 or more characters" required/>
                    </div>

                    <button type="submit" value="register">Register Now</button>
                    <a class='forgot' href='login'>Already have an account?</a>
                </form>
            </div>
        </div>

</body>
</html>
