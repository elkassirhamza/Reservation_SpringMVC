<%--
  Created by IntelliJ IDEA.
  User: Hamza
  Date: 04/04/2021
  Time: 19:42
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">

<html lang="en">
<head>
    <meta charset="utf-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no" />
    <meta name="description" content="" />
    <meta name="author" content="" />
    <title>Dashboard - SB Admin</title>a
    <link href="${pageContext.request.contextPath}/resources/home.css" rel="stylesheet" />
    <link rel="stylesheet" type="text/css"
          href="${pageContext.request.contextPath}/resources/tables.css">

    <link href="https://cdn.datatables.net/1.10.20/css/dataTables.bootstrap4.min.css" rel="stylesheet" crossorigin="anonymous" />
    <script src="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.1/js/all.min.js" crossorigin="anonymous"></script>
</head>
<body class="sb-nav-fixed">
<nav class="sb-topnav navbar navbar-expand navbar-dark bg-dark">
    <a class="navbar-brand" href="home1">Admin</a>
    <button class="btn btn-link btn-sm order-1 order-lg-0" id="sidebarToggle" href="#"><i class="fas fa-bars"></i></button>
    <!-- Navbar Search-->
    <form class="d-none d-md-inline-block form-inline ml-auto mr-0 mr-md-3 my-2 my-md-0">
        <div class="input-group">
            <input class="form-control" type="text" placeholder="Search for..." aria-label="Search" aria-describedby="basic-addon2" />
            <div class="input-group-append">
                <button class="btn btn-primary" type="button"><i class="fas fa-search"></i></button>
            </div>
        </div>
    </form>
    <!-- Navbar-->
    <ul class="navbar-nav ml-auto ml-md-0">
        <li class="nav-item dropdown">
            <a class="nav-link dropdown-toggle" id="userDropdown" href="#" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false"><i class="fas fa-user fa-fw"></i></a>
            <div class="dropdown-menu dropdown-menu-right" aria-labelledby="userDropdown">
                <a class="dropdown-item" href="#">Settings</a>
                <a class="dropdown-item" href="#">Activity Log</a>
                <div class="dropdown-divider"></div>
                <a class="dropdown-item" href="logout">Logout</a>
            </div>
        </li>
    </ul>
</nav>
<div id="layoutSidenav">
    <div id="layoutSidenav_nav">
        <nav class="sb-sidenav accordion sb-sidenav-dark" id="sidenavAccordion">
            <div class="sb-sidenav-menu">
                <div class="nav">
                    <div class="sb-sidenav-menu-heading">Core</div>
                    <a class="nav-link" href="home1">
                        <div class="sb-nav-link-icon"><i class="fas fa-tachometer-alt"></i></div>
                        Reservation request
                    </a>

                    <a class="nav-link" href="checking">
                        <div class="sb-nav-link-icon"><i class="fas fa-chart-area"></i></div>
                        Users List
                    </a>
                    <a class="nav-link" href="register1">
                        <div class="sb-nav-link-icon"><i class="fas fa-table"></i></div>
                        New Users
                    </a>
                    <a class="nav-link" href="RegisterRequest">
                        <div class="sb-nav-link-icon"><i class="fas fa-table"></i></div>
                        Request
                    </a>
                </div>
            </div>
            <%--<div class="sb-sidenav-footer">
              <div class="small">Logged in as:</div>
              Start Bootstrap
            </div>--%>
        </nav>
    </div>
    <div id="layoutSidenav_content">
        <main>
            <div class="container-fluid">
                <%--<h1 class="mt-4">Dashboard</h1>--%>
                <%--<ol class="breadcrumb mb-4">
                  <li class="breadcrumb-item active">Dashboard</li>
                </ol>--%>
                <div class="col-xl-3 col-md-6">
                    <%-- <div class="card bg-warning text-white mb-4">
                         <div class="card-body">Réservation matin</div>
                         <div class="card-footer d-flex align-items-center justify-content-between">
                             <a class="small text-white stretched-link" href="#">View Details</a>
                             <div class="small text-white"><i class="fas fa-angle-right"></i></div>
                           </div>
                       </div>
                   </div>
                 <div class="col-xl-3 col-md-6">
                     <div class="card bg-success text-white mb-4">
                         <div class="card-body">Réservation soir</div>
                         <div class="card-footer d-flex align-items-center justify-content-between">
                             <a class="small text-white stretched-link" href="#">View Details</a>
                             <div class="small text-white"><i class="fas fa-angle-right"></i></div>
                           </div>
                       </div>
                   </div>
                 <div class="col-xl-3 col-md-6">
                     <div class="card bg-danger text-white mb-4">
                         <div class="card-body">Réservation d'aujourd'hui</div>
                         <div class="card-footer d-flex align-items-center justify-content-between">
                             <a class="small text-white stretched-link" href="#">View Details</a>
                             <div class="small text-white"><i class="fas fa-angle-right"></i></div>
                           </div>
                       </div>
                   </div>--%>
                </div>
                <%--<div class="row">
                  <div class="col-xl-3 col-md-6">
                    <div class="card bg-primary text-white mb-4">
                      <div class="card-body">Réservation weekend</div>
                      <div class="card-footer d-flex align-items-center justify-content-between">
                        <a class="small text-white stretched-link" href="#">View Details</a>
                        <div class="small text-white"><i class="fas fa-angle-right"></i></div>
                      </div>
                    </div>
                  </div>--%>

                <%-- <div class="card mb-4">--%>

                <div class="card-body">
                    <h1>List Request</h1>
                    <section>
                        <div class="tbl-header">
                            <table cellpadding="0" cellspacing="0" border="0">
                                <thead>
                                <tr>
                                    <th scope="col">nom</th>
                                    <th scope="col">Prenom</th>
                                    <th scope="col">Email</th>
                                    <th scope="col">role</th>
                                    <th scope="col">statut</th>
                                    <th scope="col">Action</th>
                                </tr>
                                </thead>
                            </table>
                        </div>
                        <div class="tbl-content">
                            <table cellpadding="0" cellspacing="0" border="0">
                                <tbody>

                                <c:forEach var="users" items="${list}">
                                    <c:if test="${users.roles.roleType.equals('apprenant')}">
                                        <c:if test="${users.status == false}">
                                            <tr>
                                                <td>${users.nom}</td>
                                                <td>${users.prenom}</td>
                                                <td>${users.email}</td>
                                                <td>${users.roles.roleType}</td>
                                                <td>${users.status}</td>
                                                <td>
                                                    <form action="approuve"  method="post">
                                                        <input type="hidden" value="${users.apprenant.idUsers}"  name="id" class="form-control"/>
                                                        <input type="submit" value="Approuve" class="btn btn-danger btn-sm">
                                                    </form>
                                                </td>
                                            </tr>
                                        </c:if>
                                    </c:if>
                                </c:forEach>
                                </tbody>
                            </table>
                        </div>
                    </section>
                </div>
            </div>
    </div>
    </main>
    <%--<footer class="py-4 bg-light mt-auto">
      <div class="container-fluid">
        <div class="d-flex align-items-center justify-content-between small">
          <div class="text-muted">Copyright &copy; Your Website 2020</div>
          <div>
            <a href="#">Privacy Policy</a>
            &middot;
            <a href="#">Terms &amp; Conditions</a>
          </div>
        </div>
      </div>
    </footer>--%>
</div>
</div>
<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/js/bootstrap.bundle.min.js" crossorigin="anonymous"></script>
<script src="${pageContext.request.contextPath}/resources/script.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/Chart.js/2.8.0/Chart.min.js" crossorigin="anonymous"></script>
<script src="assets/demo/chart-area-demo.js"></script>
<script src="assets/demo/chart-bar-demo.js"></script>
<script src="https://cdn.datatables.net/1.10.20/js/jquery.dataTables.min.js" crossorigin="anonymous"></script>
<script src="https://cdn.datatables.net/1.10.20/js/dataTables.bootstrap4.min.js" crossorigin="anonymous"></script>
<script src="assets/demo/datatables-demo.js"></script>
</body>
</html>

