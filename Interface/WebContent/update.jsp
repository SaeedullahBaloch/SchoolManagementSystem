<%@page import="Teaching.*"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


<%
ListTeachers teacher = new ListTeachers();

SearchTeacher tcher = new SearchTeacherProxy().getSearchTeacher();

 teacher=tcher.findTeachers( Integer.parseInt(request.getParameter("id")));

%>

<form action="updateTeacher.jsp">
  <label for="TeacherID">TeacherID:</label><br>
  <input value="<%=teacher.getTeacherID()%>" type="text" id="TeacherID" name="teacherID" readonly="readonly"><br>
  
  <label for="RegistrationNumber">RegistrationNumber:</label><br>
  <input   value="<%=teacher.getRegistrationNumber()%>" type="text" id="RegistrationNumber" name="registrationNumber"><br>
  
  <label for="Name">Name:</label><br>
  <input  value ="<%=teacher.getName()%>" type="text" id="Name" name="Name"><br>
  
  <label for="Father">Father:</label><br>
  <input  value ="<%=teacher.getFather()%>" type="text" id="Father" name="Father"><br>
  
  <label for="DateOfBirth">DateOfBirth:</label><br>
  <input  value ="<%=teacher.getDateOfBirth()%>" type="text" id="DateOfBirth" name="DateOfBirth"><br>
  
   <label for="Phone">Phone:</label><br> 
   <input   value ="<%=teacher.getPhone()%>" type="text" id="Phone" name="Phone"><br>
   
   <label for="CNIC">CNIC:</label><br>
   <input value ="<%=teacher.getCNIC()%>"  type="text" id="CNIC" name="CNIC"><br>
   
   <label for="Qualification">Qualification:</label><br>
   <input  value ="<%=teacher.getQualification()%>" type="text" id="Qualification" name="Qualification"><br>
   
   <label for="lname">Email:</label><br>
   <input  value ="<%=teacher.getEmail()%>" type="text" id="Email" name="Email"><br>
   
   <label for="Address">Address:</label><br>
   <input  value ="<%=teacher.getAddress()%>" type="text" id="Address" name="Address"><br>
   
   <label for="RegistrationDate">RegistrationDate:</label><br>
   <input  value ="<%=teacher.getRegistrationDate()%>" type="text" id="RegistrationDate" name="RegistrationDate"><br>
   
    <label for="lname">Status:</label><br>
   <input  value ="<%=teacher.getStatus()%>" type="text" id="Status" name="Status"><br>
   
  <button type="submit">Update Teacher!</button>
  
</body>
</html>