<%@ taglib uri="http://java.sun.com/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>

<!DOCTYPE>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Reservation</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
    <script src="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.1/js/all.min.js" crossorigin="anonymous"></script>
    <link href="${pageContext.request.contextPath}/resources/home.css" rel="stylesheet" />
    <link href="https://cdnjs.cloudflare.com/ajax/libs/mdbootstrap/4.19.1/css/mdb.min.css" rel="stylesheet">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/animate.css/4.1.1/animate.min.css"/>
    <style>
        body{
            background: -webkit-linear-gradient(left, #25c481, #25b7c4);
            background: linear-gradient(to right, #25c481, #25b7c4);
            font-family: 'Roboto', sans-serif;
        }
        .formu{
            margin-top: 6rem;
            width: 50%;

        }
        .form-control{
            width: 40% !important;
        }
        .inp{
            display: flex;
            justify-content: space-between;
            align-items: center;
            margin-left: 6rem;
            margin-bottom: 3rem;
        }
    </style>
</head>
<body>
<nav class="sb-topnav navbar navbar-expand navbar-dark bg-dark">
    <a class="btn btn-success" href="historiquePersonne">Historique</a>
    <!-- Navbar Search-->
    <form class="d-none d-md-inline-block form-inline ml-auto mr-0 mr-md-3 my-2 my-md-0">
        <a class="btn btn-danger btn-lg" href="logout">Logout</a>
    </form>

</nav>
<br>
<br>
<%-----------------------------------------------------------------------------------------------------%>
<%--
<a class="btn btn-danger " href="logout">Logout</a>
--%>
<div  align="center">
    <h1>Welcome <%= request.getSession().getAttribute("prenom") %></h1>
    <%--<a href="historiquePersonne">Historique</a>--%>
    <form class="formu" method="post" action="${pageContext.request.contextPath}/saveReservation">
       <div class="inp animate__animated animate__bounce ">
        <input id="date" type="Date" name="date" /><%--<br><br>--%>
        <select id="inputState" class="form-control" name="typeReservation">
            <option value ="weekend">weekend</option>
            <option value ="matin">matin</option>
            <option value ="soir">soir</option>
        </select><br><br>
       </div>
        <input class="btn btn-success" type="submit" value="Save"/>
    </form>
</div>
<script>
    function SetMinDate() {
        var now = new Date();

        var day = ("0" + now.getDate()).slice(-2);
        var month = ("0" + (now.getMonth() + 1)).slice(-2);

        var today = now.getFullYear() + "-" + (month) + "-" + (day);


        document.getElementById("date").min = today;
    }
    SetMinDate();
</script>
<script src="${pageContext.request.contextPath}/resources/script.js"></script>

</body>
</html>
