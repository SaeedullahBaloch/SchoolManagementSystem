<%@page import="org.apache.coyote.Request"%>

<%@ page import="Teaching.*" %>
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
Update update=new UpdateProxy().getUpdate();




int i=update.updateTeacher(Integer.parseInt(request.getParameter("teacherID")),
		Integer.parseInt(request.getParameter("registrationNumber")),
		request.getParameter("Name"),
		request.getParameter("Father"),
		request.getParameter("DateOfBirth"),
		request.getParameter("Phone"),
		request.getParameter("CNIC"), 
		request.getParameter("Qualification"), 
		request.getParameter("Email"), 
		request.getParameter("Address"), 
		request.getParameter("RegistrationDate"), 
		request.getParameter("Status")
		);

if(i==1)
{
	%>
	<h1>updated</h1>
	<% 
	
	
}

else
{
	%>
	<h1>Failed</h1>
	<% 
}
%>
</body>
</html>