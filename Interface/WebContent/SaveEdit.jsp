<%@ page import="Main.*" %>
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

EditStudents edit = new EditStudentsProxy().getEditStudents();


int i=edit.editStudents(Integer.parseInt(request.getParameter("AdmissionID")), 
		request.getParameter("stdName"), request.getParameter("FatherName"), 
		request.getParameter("DOB"), request.getParameter("Phone"), 
		request.getParameter("Address"), request.getParameter("Email"), 
	 Integer.parseInt(request.getParameter("Class")), 
		request.getParameter("status"));





if(i==1)
{
	%>
	
	<h1>Student Has been Edited</h1>
	<a href="ListStudents.jspo">Show Student List</a>
	<% 
}

else 
{
	%>
	<h1>Insertion Failed</h1>
	
	<% 
}


%>



</body>
</html>