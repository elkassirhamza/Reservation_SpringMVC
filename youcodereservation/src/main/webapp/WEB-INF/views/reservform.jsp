<%@ taglib uri="http://java.sun.com/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>

<!DOCTYPE>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Reservation</title>
    <style>
        body{background-color: #6eb6de}
    </style>
</head>
<body>
<div align="center">
    <h1>Welcome ${name}</h1>




    <form:form action="saveReservation" method="post"
               modelAttribute="reservation">
        <td>Date:</td>
        <form:input type="date" id="start" name="trip-start"
                    value="22-07-2021" min="01-01-2021" max="31-12-2022"
                    path="dateReservation" />
        <td colspan="2" align="center">
            <input type="submit" value="Save">

        </td>


    </form:form>




</div>

</body>
</html>
