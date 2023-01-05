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

SearchTeacher search = new SearchTeacherProxy().getSearchTeacher();

ListTeachers teacher = search.findTeachers( Integer.parseInt(request.getParameter("TeacherID")));

 %>
 
 
 
 <table border="1px" width="20%">
 <tr>
 
 <td>Id </td>
 <td> <%=teacher.getTeacherID() %></td>
 
 
 </tr>
 <tr>
 
 <td>Name </td>
 <td> <%=teacher.getName() %></td>
 
 
 </tr>
 <tr>
 
 <td>Father</td>
 <td> <%=teacher.getFather()%></td>
 
 
 </tr>
 <tr>
 
 <td>DateOfBirth </td>
 <td> <%=teacher.getDateOfBirth() %></td>
 
 
 </tr>
 <tr>
 
 <td>CNIC </td>
 <td> <%=teacher.getCNIC() %></td>
 
 
 </tr>
 <tr>
 
 <td>Phone </td>
 <td> <%=teacher.getPhone() %></td>
 
 
 </tr>
 <tr>
 
 <td>Email </td>
 <td> <%=teacher.getEmail() %></td>
 
 
 </tr>
 <tr>
 
 <td>Qualification </td>
 <td> <%=teacher.getQualification() %></td>
 
 
 </tr>
 <tr>
 
 <td>RegistrationDate </td>
 <td> <%=teacher.getRegistrationDate() %></td>
 
 
 </tr>
 <tr>
 
 <td>Address </td>
 <td> <%=teacher.getAddress() %></td>
 
 
 </tr>
 <tr>
 
 <td>status </td>
 <td> <%=teacher.getStatus()%></td>
 
 
 </tr>

 </table>
 

</body>
</html>