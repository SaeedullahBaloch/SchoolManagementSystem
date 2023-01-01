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
			String Query="INSERT INTO `examination`(`ExamID`, `Name`, `StartDate`, `EndDate`, `Status`)"+"VALUES ("+ExamID+", '"+Name+"','"+ StartDate+"','"+EndDate+"',"+status+");";			
			System.out.println(Query);
			stmt.executeUpdate(Query);
			con.close();
		} catch(Exception e)
		{
		System.out.println(e);
		}
	return 0;
	}
}
