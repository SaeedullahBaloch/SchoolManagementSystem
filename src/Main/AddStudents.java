package Main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class AddStudents {

	
	
	public void addNewStudent(int AdmissionNumber,String StudentName, String Father, String DOB, String Phone, String Address, String Email, int ClassID, int status)
	{
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbschoolmanagement","root","");
				
			
			Statement stmt=con.createStatement();
			
			
			stmt.executeUpdate("insert into Students(AdmissionNumber, StudentName, FatherName, DateOfBirth, Phone, Address, Email, ClassesID, Status) values ('"+AdmissionNumber+"', '"+StudentName+"', '"+Father+"', "
					+ "'"+DOB+"', '"+Phone+"', '"+ Address+"', "
					+Email+"', '"+ClassID+"', '"+status+"')");
			
		}
		
		catch(Exception ex)
		{
			System.out.println(ex.getMessage());
		}
		
		
		
	}
}