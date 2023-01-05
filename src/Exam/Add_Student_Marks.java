package Exam;
import java.sql.*;

public class Add_Student_Marks {
	public int addstudentmarks(int ExamID,int StudentID, int TeacherID , int TotalMarks , int ObtainedMarks,String Result) 
	{
	try{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con =
		DriverManager.getConnection("jdbc:mysql://localhost:3306/dbschoolmanagement","root","");
		Statement stmt=con.createStatement();
		String Query="INSERT INTO marks( ExamID ,StudentID, TeacherID, TotalMarks, ObtainedMarks, Result) VALUES ('"+ExamID+"', '"+StudentID+"','"+TeacherID+"','"+TotalMarks+"','"+ObtainedMarks+"','"+Result+"')";

		int i=	stmt.executeUpdate(Query);
		
	    con.close();
				return i;
	
		} catch(Exception e)
		{
		System.out.println(e);
		}
		return 0;
		}
	
}
