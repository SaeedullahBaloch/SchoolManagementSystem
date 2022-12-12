package Main;

import java.sql.*;

public class Students {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try {
	
	Class.forName("com.mysql.jdbc.Driver");
	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbschoolmanagement","root","");
	
	
	Statement stmt=con.createStatement();
	
	ResultSet rs=stmt.executeQuery("SELECT AdmissionNumber, StudentName, FatherName, DateOfBirth,Phone, Address,Email, class.Name as Class\r\n" + 
			"FROM `students` \r\n" + 
			"join class on class.ClassID = students.ClassesID\r\n" + 
			"\r\n" + 
			"WHERE Status = 1");

	
	while(rs.next())
	{

	System.out.println("Admission Number : " + rs.getString(2) +
			" Name: " + rs.getString(3) +
			" Father : " +rs.getString(4) + 
			" Date of Birth : " +rs.getString(5)+
			" Phone : " +rs.getString(6)+
			" Address : " +rs.getString(7) +
			" Email : " +rs.getString(7)+
			" Class : " +rs.getString(8)
			
			);
	}
	con.close();
		
}

catch(Exception ex){
	System.out.println(ex);
	
}
		
}

}
