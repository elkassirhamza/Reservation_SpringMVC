<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Hamza
  Date: 30/03/2021
  Time: 15:22
  To change this template use File | Settings | File Templates.
--%>

<html lang="en">
<head>
    <title>Table V04</title>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
    <link rel="stylesheet" type="text/css"
          href="${pageContext.request.contextPath}/resources/tables.css">

    <!--===============================================================================================-->
</head>
<body>
<div class="container">
<a class="btn btn-danger float-right" href="logout">Logout</a>
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
                <th scope="col">Action</th>
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
                            <p>Non confirmer</p>
                        </c:if>
                    </td>
                    <td class="d-flex flex-row">
                        <form action="deleteReservation"  method="post">
                            <input type="hidden" value="${reservation.idReservation}"  name="id" class="form-control"/>
                            <input type="submit" value="Supprimer" class="btn btn-danger btn-sm">
                        </form>
                        <c:if test="${reservation.confirmation == false}">
                            <form action="AccpterReservation"  method="post">
                                <input type="hidden" value="${reservation.idReservation}"  name="id" class="form-control"/>
                                <input type="submit" value="Accepter" class="btn btn-primary btn-sm">
                            </form>
                        </c:if>
                    </td>

                </tr>
            </c:forEach>
            </tbody>
        </table>
    </div>
</section>

</div>
<script>
    $(window).on("load resize ", function() {
        var scrollWidth = $('.tbl-content').width() - $('.tbl-content table').width();
        $('.tbl-header').css({'padding-right':scrollWidth});
    }).resize();
</script>
</body>
</html>