package Exam;
import java.sql.*;

public class Creat_Exam {

	public int addExam(int ExamID, String Name, String StartDate, String EndDate, int status )
	{
		
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con =
			DriverManager.getConnection("jdbc:mysql://localhost:3306/dbschoolmanagement","root","");
			Statement stmt=con.createStatement();
			String Query="INSERT INTO examination (ExamID, Name, StartDate, EndDate, Status) VALUES ('"+ExamID+"', '"+Name+"', '"+StartDate+"','"+EndDate+"','"+status+"')";			
			
			int rs = stmt.executeUpdate(Query);
			
		
			con.close();
			return rs;
		} catch(Exception e)
		{
		System.out.println(e);
		}
	return 0;
	}
}
