<%@page import="Main.StudentList"%>
<%@page import="Main.SearchStudentsProxy"%>
<%@page import="Main.SearchStudents"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>

   <link rel="shortcut icon" type="image/x-icon" href="~/img/favicon.png">
    <!-- Normalize CSS -->
    <link rel="stylesheet" href="Assets/css/normalize.css">
    <!-- Main CSS -->
    <link rel="stylesheet" href="Assets/css/main.css">
    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="Assets/css/bootstrap.min.css">
    <!-- Fontawesome CSS -->
    <link rel="stylesheet" href="Assets/css/all.min.css">
    <!-- Flaticon CSS -->
    <link rel="stylesheet" href="Assets/fonts/flaticon.css">
    <!-- Animate CSS -->
    <link rel="stylesheet" href="Assets/css/animate.min.css">
    <!-- Data Table CSS -->
    <link rel="stylesheet" href="Assets/css/jquery.dataTables.min.css">
    <!-- Custom CSS -->
  <link href="Assets/css/style.css" rel="stylesheet" type="text/css">
    <!-- Modernize js -->
    <script src="Assets/js/modernizr-3.6.0.min.js"></script>
<body>

<form action="">
 <div id="wrapper" class="wrapper bg-ash">


<%

SearchStudents students = new SearchStudentsProxy().getSearchStudents();

StudentList student  =students.findStudents(Integer.parseInt(request.getParameter("AdmissionID")));

%>



   <!-- Header Menu Area Start Here -->
        <div class="navbar navbar-expand-md header-menu-one bg-light">
            <div class="nav-bar-header-one">
                <div class="header-logo">
                    <a href="index.html">
                        <img src="Assets/img/logo.png" alt="logo">
                    </a>
                </div>
                  <div class="toggle-button sidebar-toggle">
                    <button type="button" class="item-link">
                        <span class="btn-icon-wrap">
                            <span></span>
                            <span></span>
                            <span></span>
                        </span>
                    </button>
                </div>
            </div>
            <div class="d-md-none mobile-nav-bar">
               <button class="navbar-toggler pulse-animation" type="button" data-toggle="collapse" data-target="#mobile-navbar" aria-expanded="false">
                    <i class="far fa-arrow-alt-circle-down"></i>
                </button>
                <button type="button" class="navbar-toggler sidebar-toggle-mobile">
                    <i class="fas fa-bars"></i>
                </button>
            </div>
            <div class="header-main-menu collapse navbar-collapse" id="mobile-navbar">
                <ul class="navbar-nav">
                    <li class="navbar-item header-search-bar">
                        <div class="input-group stylish-input-group">
                            <span class="input-group-addon">
                                <button type="submit">
                                    <span class="flaticon-search" aria-hidden="true"></span>
                                </button>
                            </span>
                            <input type="text" class="form-control" placeholder="Find Something . . .">
                        </div>
                    </li>
                </ul>
                <ul class="navbar-nav">
                    <li class="navbar-item dropdown header-admin">
                        <a class="navbar-nav-link dropdown-toggle" href="#" role="button" data-toggle="dropdown"
                            aria-expanded="false">
                            <div class="admin-title">
                                <h5 class="item-title">Saeed</h5>
                                <span>Admin</span>
                            </div>
                            <div class="admin-img">
                                <img src="Assets/img/figure/admin.jpg" alt="Admin">
                            </div>
                        </a>
                      
                    </li>
                     
                </ul>
            </div>
        </div>
        <!-- Header Menu Area End Here -->
        <!-- Page Area Start Here -->
        <div class="dashboard-page-one">
            <!-- Sidebar Area Start Here -->
            <div class="sidebar-main sidebar-menu-one sidebar-expand-md sidebar-color">
               <div class="mobile-sidebar-header d-md-none">
                    <div class="header-logo">
                        <a href="ListStudents.jsp"><img src="Assets/img/logo1.png" alt="logo"></a>
                    </div>
               </div>
                <div class="sidebar-menu-content">
                    <ul class="nav nav-sidebar-menu sidebar-toggle-view">
                       
                        <li class="nav-item sidebar-nav-item">
                            <a href="#" class="nav-link"><i class="flaticon-classmates"></i><span>Students</span></a>
                            <ul class="nav sub-group-menu">
                                <li class="nav-item">
                                    <a href="ListStudents.jsp" class="nav-link"><i class="fas fa-angle-right"></i>All
                                        Students</a>
                                </li>
                                <li class="nav-item">
                                    <a href="student-details.html" class="nav-link"><i
                                            class="fas fa-angle-right"></i>Student Details</a>
                                </li>
                                <li class="nav-item">
                                    <a href="AddStudents.jsp" class="nav-link"><i
                                            class="fas fa-angle-right"></i>Admission Form</a>
                                </li>
                                <li class="nav-item">
                                    <a href="student-promotion.html" class="nav-link"><i
                                            class="fas fa-angle-right"></i>Student Promotion</a>
                                </li>
                            </ul>
                        </li>
                        <li class="nav-item sidebar-nav-item">
                            <a href="#" class="nav-link"><i
                                    class="flaticon-multiple-users-silhouette"></i><span>Teachers</span></a>
                            <ul class="nav sub-group-menu">
                                <li class="nav-item">
                                    <a href="TeacherListing.jsp" class="nav-link"><i class="fas fa-angle-right"></i>All
                                        Teachers</a>
                                </li>
                                <li class="nav-item">
                                    <a href="SearchTeacher.jsp" class="nav-link"><i
                                            class="fas fa-angle-right"></i>Search Teacher</a>
                                </li>
                                <li class="nav-item">
                                    <a href="addTeacher.jsp" class="nav-link"><i class="fas fa-angle-right"></i>Add
                                        Teacher</a>
                                </li>
                             
                            </ul>
                        </li>
                        
                    
                        <li class="nav-item sidebar-nav-item">
                            <a href="#" class="nav-link"><i class="flaticon-technological"></i><span>Acconunt</span></a>
                            <ul class="nav sub-group-menu">
                                <li class="nav-item">
                                    <a href="ListFee.jsp" class="nav-link"><i class="fas fa-angle-right"></i>All Fees
                                        Collection</a>
                                </li>
                                <li class="nav-item">
                                    <a href="CollectFee.jsp" class="nav-link"><i
                                            class="fas fa-angle-right"></i>Collect Fee</a>
                                </li>
                               
                            </ul>
                        </li>
                        <li class="nav-item sidebar-nav-item">
                            <a href="#" class="nav-link"><i
                                    class="flaticon-maths-class-materials-cross-of-a-pencil-and-a-ruler"></i><span>Exam</span></a>
                            <ul class="nav sub-group-menu">
                                <li class="nav-item">
                                    <a href="List_of_Exam.jsp" class="nav-link"><i class="fas fa-angle-right"></i> Exam List</a>
                                </li>
                                <li class="nav-item">
                                    <a href="Maaarkslist.jsp" class="nav-link"><i class="fas fa-angle-right"></i>Mark List</a>
                                </li>
                                  <li class="nav-item">
                                    <a href="StudentMarks.jsp" class="nav-link"><i class="fas fa-angle-right"></i>Add Marks</a>
                                </li>
                            </ul>
                        </li>
                      
                    </ul>
                </div>
            </div>





   <div class="dashboard-page-one">
     <!-- Sidebar Area End Here -->
            <div class="dashboard-content-one">
                <!-- Breadcubs Area Start Here -->
                <div class="breadcrumbs-area">
                    <h3>Students</h3>
                    <ul>
                        <li>
                            <a href="index.html">Home</a>
                        </li>
                        <li>Student Details</li>
                    </ul>
                </div>
                <!-- Breadcubs Area End Here -->
                <!-- Student Details Area Start Here -->
                <div class="card height-auto">
                    <div class="card-body">
                        <div class="heading-layout1">
                            <div class="item-title">
                                <h3>About Student</h3>
                            </div>
                           <div class="dropdown">
                                <a class="dropdown-toggle" href="#" role="button" 
                                data-toggle="dropdown" aria-expanded="false">...</a>
        
                                <div class="dropdown-menu dropdown-menu-right">
                                    <a class="dropdown-item" href="#"><i class="fas fa-times text-orange-red"></i>Close</a>
                                    <a class="dropdown-item" href="EditStudents.jsp?AdmissionID=<%=student.getAdmissionNumber()%>"><i class="fas fa-cogs text-dark-pastel-green"></i>Edit</a>
                                    
                                    <a class="dropdown-item" href="DeleteStudent.jsp?AdmissionID=<%=student.getAdmissionNumber()%>"><i class="fas fa-redo-alt text-orange-peel"></i>Delete</a>
                                </div>
                            </div>
                        </div>
                        <div class="single-info-details">
                            <div class="item-img">
                                <img src="Assets/img/figure/student1.jpg" alt="student">
                            </div>
                   
                              
                                <div class="info-table table-responsive">
                                    <table class="table text-nowrap">
                                        <tbody>
                                            <tr>
                                                <td>Name:</td>
                                                <td class="font-medium text-dark-medium"> <%=student.getName() %></td>
                                            </tr>
                                        
                                            <tr>
                                                <td>Father Name:</td>
                                                <td class="font-medium text-dark-medium"> <%out.println(student.getFather()); %></td>
                                            </tr>
                                          
                                            <tr>
                                                <td>Date Of Birth:</td>
                                                <td class="font-medium text-dark-medium"> <%=student.getDOB() %></td>
                                            </tr>
                                          
                                           
                                            <tr>
                                                <td>E-mail:</td>
                                                <td class="font-medium text-dark-medium"> <%=student.getEmail() %></td>
                                            </tr>
                                            <tr>
                                                <td>Phone:</td>
                                                <td class="font-medium text-dark-medium"> <%=student.getPhone() %></td>
                                            </tr>
                                            <tr>
                                                <td>Class:</td>
                                                <td class="font-medium text-dark-medium"><%=student.getClassID() %>></td>
                                            </tr>
                                            <tr>
                                                <td>Address:</td>
                                                <td class="font-medium text-dark-medium"> <%=student.getAddress() %> </td>
                                            </tr>
                                            <tr>
                                                <td>Status:</td>
                                                <td class="font-medium text-dark-medium"><%=student.getStatus() %></td>
                                            </tr>
                                          
                                        </tbody>
                                    </table>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
                </div>
                <!-- Student Details Area End Here -->

</div>


</form>


 <!-- jquery-->
    <script src="Assets/js/jquery-3.3.1.min.js"></script>
    <!-- Plugins js -->
    <script src="Assets/js/plugins.js"></script>
    <!-- Popper js -->
    <script src="Assets/js/popper.min.js"></script>
    <!-- Bootstrap js -->
    <script src="Assets/js/bootstrap.min.js"></script>
    <!-- Scroll Up Js -->
    <script src="Assets/js/jquery.scrollUp.min.js"></script>
    <!-- Data Table Js -->
    <script src="Assets/js/jquery.dataTables.min.js"></script>
    <!-- Custom Js -->
    <script src="Assets/js/main.js"></script>
</body>
</html>