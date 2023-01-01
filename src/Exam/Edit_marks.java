package Exam;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Edit_marks {
	
	
	
	public int edit_marks(String ExamID ,String StudentID, String TeacherID,int TotalMarks, int  ObtainedMarks,String Result) {
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con =
			DriverManager.getConnection("jdbc:mysql://localhost:3306/dbschoolmanagement","root","");
			Statement stmt=con.createStatement();
			String Query="Update marks SET ExamID='"+ExamID+"',StudentID='"+StudentID+"',TeacherID='"+TeacherID+"',TotalMarks="+TotalMarks+",Result='"+Result+"' WHERE ObtainedMarks='"+ObtainedMarks+"'";
			System.out .append(Query);
			stmt.executeUpdate(Query);
			con.close();
			} 
		catch(Exception e)
			{
			System.out.println(e);
			}
		return 0;
		}
}