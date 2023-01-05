<%@page import="Exam.*"%>
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

Add_Student_Marks teacher=new Add_Student_MarksProxy().getAdd_Student_Marks();


int i=teacher.addstudentmarks(Integer.parseInt(request.getParameter("ExamID")),
		Integer.parseInt(request.getParameter("StudentID")),	
		Integer.parseInt(request.getParameter("TeacherID")),
	Integer.parseInt(request.getParameter("TotalMarks")),
	Integer.parseInt(request.getParameter("ObtainedMarks")),
	request.getParameter("Result"));



if(i==1)
{
%>
<h1>Data saved</h1>
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
