<%@ page import="Exam.*" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert</title>
</head>
<form action=change Edit_exam.jsp></form>
<body>

<%
Creat_Exam bp= new Creat_ExamProxy().getCreat_Exam();


int i=  bp.addExam(Integer.parseInt(request.getParameter("ID")),request.getParameter("name"), request.getParameter("Sdate") ,request.getParameter("Edate"), Integer.parseInt(request.getParameter("status")));

if(i==1)
{
%>

<h1>Data Inserted</h1>

<% 
}

else 
	
{
%>

<h1>Failed to save data</h1>
<%
}

%>







</body>
</html>