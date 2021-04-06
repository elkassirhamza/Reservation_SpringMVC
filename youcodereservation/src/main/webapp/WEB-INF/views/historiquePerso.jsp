<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Hamza
  Date: 31/03/2021
  Time: 14:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" type="text/css"
          href="${pageContext.request.contextPath}/resources/tables.css">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
    <script src="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.1/js/all.min.js" crossorigin="anonymous"></script>
    <link href="${pageContext.request.contextPath}/resources/home.css" rel="stylesheet" />
</head>
<body>
<nav class="sb-topnav navbar navbar-expand navbar-dark bg-dark">
    <a class="btn btn-success" href="reservform">New Reservation</a>
    <!-- Navbar Search-->
    <form class="d-none d-md-inline-block form-inline ml-auto mr-0 mr-md-3 my-2 my-md-0">
        <a class="btn btn-danger " href="logout">Logout</a>
    </form>

</nav>
<section>
    <!--for demo wrap-->
    <h1>Reservations</h1>
    <div class="tbl-header">
        <table cellpadding="0" cellspacing="0" border="0">
            <thead>
            <tr>
                <th scope="col">nom</th>
                <th scope="col">Prenom</th>
                <th scope="col">date_Reservation</th>
                <th scope="col">Type</th>
                <th scope="col">Confirmation</th>
            </tr>
            </thead>
        </table>
    </div>
    <div class="tbl-content">
        <table cellpadding="0" cellspacing="0" border="0">
            <tbody>
            <c:forEach var="reservation" items="${listReservation}">
                <tr>
                    <td>${reservation.apprenant.nom}</td>
                    <td>${reservation.apprenant.prenom}</td>
                    <td>${reservation.dateReservation}</td>
                    <td>${reservation.typeReservation}</td>
                    <td>
                        <c:if test="${reservation.confirmation == true}">
                            <p>Confirmer</p>
                        </c:if>
                        <c:if test="${reservation.confirmation == false}">
                            <p>En attante</p>
                        </c:if>
                    </td>
                </tr>
            </c:forEach>
            </tbody>
        </table>
    </div>
</section>

</body>
</html>
