<%@page import="Main.DeleteStudentsProxy"%>
<%@page import="Main.DeleteStudents"%>
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

DeleteStudents delet = new DeleteStudentsProxy().getDeleteStudents();
 int i =delet.deleteStudent(Integer.parseInt(request.getParameter("AdmissionID")));
 
 
 if(i==1)
 {
	 %>

<h1>Student Has been Deleted</h1>
<a href="ListStudents.jsp">return to Student List</a>
<% 	 
 }
 
 else 
 {
	 %>
	 
	 <h1>Deletion Failed</h1>
	 <%
 }

%>



</body>
</html>