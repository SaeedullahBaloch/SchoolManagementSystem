package Main;

import java.sql.*;

public class Students {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try {
	
	Class.forName("com.mysql.jdbc.Driver");
	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbschoolmanagement","root","");
	
	
	Statement stmt=con.createStatement();
	
	ResultSet rs=stmt.executeQuery("SELECT * FROM students");

	
	
	while(rs.next())
	{

	System.out.println("ID: " + rs.getString(1) + " Name: " + rs.getString(2) + " Designation : " +rs.getString(3));
	
	}
	con.close();
		
}

catch(Exception ex){
	System.out.println(ex);
	
}
		
}

}
