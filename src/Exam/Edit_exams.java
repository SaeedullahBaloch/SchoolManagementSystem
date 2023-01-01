package Exam;
import java.sql.*;


public class Edit_exams {

	
	
	public int edit_exam(int ExamID ,String Name,String StartDate,String EndDate,String Status)
	{
	
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con =
			DriverManager.getConnection("jdbc:mysql://localhost:3306/dbschoolmanagement","root","");
			Statement stmt=con.createStatement();
			String Query="UPDATE `examination` SET `ExamID`="+ExamID+",`Name`='"+Name+"',`StartDate`='"+StartDate+"',`EndDate`='"+EndDate+"',`Status`='"+Status+"' WHERE `ExamID` = '"+ExamID+"';";
			System.out.println(Query);
			stmt.executeUpdate(Query);
			System.out.println(Query);
			con.close();
		} catch(Exception e)
		{
		System.out.println(e);
		}
	return 0;
	}
}
