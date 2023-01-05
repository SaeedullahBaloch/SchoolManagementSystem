<%@page import="Main.*" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>School</title>



    <link rel="shortcut icon" type="image/x-icon" href="Assets/img/favicon.png">
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


</head>
<body>

<%
SearchStudents students = new SearchStudentsProxy().getSearchStudents();

StudentList student  =students.findStudents(Integer.parseInt(request.getParameter("AdmissionID")));



%>

<form action="SaveEdit.jsp">

 <div class="dashboard-content-one">
                <!-- Breadcubs Area Start Here -->
                <div class="breadcrumbs-area">
                    <h3>Students</h3>
                    <ul>
                        <li>
                            <a href="index.html">Home</a>
                        </li>
                        <li>Student Admit Form</li>
                    </ul>
                </div>
                <!-- Breadcubs Area End Here -->
                <!-- Admit Form Area Start Here -->
                <div class="card height-auto">
                    <div class="card-body">
                        <div class="heading-layout1">
                            <div class="item-title">
                                <h3>Add New Students</h3>
                            </div>
                            <div class="dropdown">
                                <a class="dropdown-toggle" href="#" role="button" data-toggle="dropdown"
                                    aria-expanded="false">...</a>

                                <div class="dropdown-menu dropdown-menu-right">
                                    <a class="dropdown-item" href="#"><i
                                            class="fas fa-times text-orange-red"></i>Close</a>
                                    <a class="dropdown-item" href="#"><i
                                            class="fas fa-cogs text-dark-pastel-green"></i>Edit</a>
                                    <a class="dropdown-item" href="#"><i
                                            class="fas fa-redo-alt text-orange-peel"></i>Refresh</a>
                                </div>
                            </div>
                        </div>
                        <form class="new-added-form">
                            <div class="row">
                                <div class="col-xl-3 col-lg-6 col-12 form-group">
                                    <label> Name *</label>
                                    <input value= "<%=student.getName()%>" name="stdName"  type="text" placeholder="" class="form-control">
                                </div>
                                <div class="col-xl-3 col-lg-6 col-12 form-group">
                                    <label>Father *</label>
                                    <input value= "<%=student.getFather()%>"  name ="FatherName" type="text" placeholder="" class="form-control">
                                </div>
                               
                                <div class="col-xl-3 col-lg-6 col-12 form-group">
                                    <label>Date Of Birth *</label>
                                    <input value= "<%=student.getDOB()%>"  name ="DOB" type="text" placeholder="dd/mm/yyyy" class="form-control air-datepicker"
                                        data-position='bottom right'>
                                    <i class="far fa-calendar-alt"></i>
                                </div>
                                <div class="col-xl-3 col-lg-6 col-12 form-group">
                                    <label>Phone</label>
                                    <input value= "<%=student.getPhone()%>"  name ="Phone" type="text" placeholder="" class="form-control">
                                </div>
                                <div class="col-xl-3 col-lg-6 col-12 form-group">
                                     <label>Address</label>
                                    <input value= "<%=student.getAddress()%>"  name="Address" type="text" placeholder="" class="form-control">
                                </div>
                               
                                <div class="col-xl-3 col-lg-6 col-12 form-group">
                                    <label>E-Mail</label>
                                    <input value= "<%=student.getEmail()%>"  name ="Email" type="email" placeholder="" class="form-control">
                                </div>
                                <div class="col-xl-3 col-lg-6 col-12 form-group">
                                    <label>Class *</label>
                                    <select value="<%=student.getClassID()%>"  name= "Class" class="select2">
                                        <option value="">Please Select Class *</option>
                                        <option value="1">Play</option>
                                        <option value="2">Nursery</option>
                                        <option value="3">One</option>
                                        <option value="3">Two</option>
                                        <option value="3">Three</option>
                                        <option value="3">Four</option>
                                        <option value="3">Five</option>
                                    </select>
                                </div>
                                
                                <div class="col-xl-3 col-lg-6 col-12 form-group">
                                    <label>Admission ID</label>
                                    <input value= "<%=student.getAdmissionNumber()%>"  name="AdmissionID" type="text" placeholder="" readonly="readonly" class="form-control">
                                </div>
                                <div  class="col-xl-3 col-lg-6 col-12 form-group">
                             
                             
                              <select value= "<%=student.getStatus()%>"  name= "status" class="select2">
                                        <option value="">Please Select Status *</option>
                                        <option value="1">Active</option>
                                        <option value="2">Drop out</option>
                                        <option value="3">Pass out</option>
               
                                    </select>
                                </div>
                              
                              
                                <div class="col-12 form-group mg-t-8">
                                    <button type="submit" class="btn-fill-lg btn-gradient-yellow btn-hover-bluedark">Save</button>
                                    <button type="reset" class="btn-fill-lg bg-blue-dark btn-hover-yellow">Reset</button>
                                </div>
                            </div>
                        </form>
                    </div>
                </div>


</div>


</body>
</html>