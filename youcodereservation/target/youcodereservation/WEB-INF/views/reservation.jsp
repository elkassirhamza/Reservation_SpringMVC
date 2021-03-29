<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
     <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">

</head>
<body  class="mx-auto">


        <a href="reservform"><button type="button" class="btn btn-outline-success">New Reservation</button></a>
<table class="table table-striped">
  <thead>
    <tr>
      <th scope="col">id_Reservation</th>
      <th scope="col">date_Reservation</th>
    
      <th scope="col">Confirmation</th>
        <th scope="col">username</th>
    </tr>
  </thead>
  <tbody>
 
 <c:forEach var="reservation" items="${listReservation}">
                <tr>
 
                    <td>${reservation.idReservation}</td>
                    <td>${reservation.dateReservation}</td>
                    <td>${reservation.confirmation}</td>
                    <td>${reservation.apprenant.nom}</td>
                 
                </tr>
            </c:forEach>

 
  </tbody>
   </table>
  </body>


</html>