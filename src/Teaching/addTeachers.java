package Teaching;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class addTeachers {
	

	
	public void addNewTeacher(int TeacherID,int RegistrationNumber,String Name,String Father, String DateOfBirth, String Phone, String CNIC,
		String Qualification,String Email,String Address,String RegistrationDate,String Status)
	{
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/schoolmanagmentdb","root","");
	
			
			Statement stmt=con.createStatement();
			
			
			stmt.executeUpdate("INSERT INTO teachers (TeacherID,RegistrationNumber,Name,Father,DateOfBirth,Phone,CNIC,Qualification,Email,Address,RegistrationDate,Status)"
					+ "values ('"+TeacherID+"', '"+RegistrationNumber+"', '"+Name+"', "
					+ "'"+Father+"', '"+DateOfBirth+"', '"+Phone+"',"
					+"'"+CNIC+"', '"+Qualification+"','"+Email+"','"+Address+"','"+RegistrationDate+"','"+Status+"')");
			
		}
		
		catch(Exception ex)
		{
			System.out.println(ex.getMessage());
		}
		
		
	}
}
