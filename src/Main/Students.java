package Main;

import java.sql.*;

public class Students {
	
public static void main(String[] args) {
		
	
	
	

		
try {

	
	Class.forName("com.mysql.jdbc.Driver");
	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbschoolmanagement","root","");
	
	
	Statement stmt=con.createStatement();
	
	ResultSet rs=stmt.executeQuery("SELECT AdmissionNumber, StudentName, FatherName, DateOfBirth,Phone, Address,Email, class.Name as Class\r\n" + 
			"FROM `students` \r\n" + 
"join class on class.ClassID = students.ClassesID\r\n");

	
	
	while(rs.next())
	{

	System.out.println("Admission Number : " + rs.getString(1) +
			" Name: " + rs.getString(2) +
			" Father : " +rs.getString(3) + 
			" Date of Birth : " +rs.getString(4)+
			" Phone : " +rs.getString(5)+
			" Address : " +rs.getString(7) +
			" Email : " +rs.getString(6)+
			" Class : " +rs.getString(7)
			
			);
	}
	con.close();
		
}

catch(Exception ex){
	System.out.println(ex);
	
}
		
}

}