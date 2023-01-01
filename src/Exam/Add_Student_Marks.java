package Exam;
import java.sql.*;

public class Add_Student_Marks {
	public int addstudent(int AdmissionNumber,String StudentName, String FatherName , String DateOfBirth , String Phone,String Address,String Email , int ClassesID, int Status) 
	{
	try{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con =
		DriverManager.getConnection("jdbc:mysql://localhost:3306/dbschoolmanagement","root","");
		Statement stmt=con.createStatement();
		String Query="INSERT INTO `students`( `AdmissionNumber`, `StudentName`, `FatherName`, `DateOfBirth`, `Phone`, `Address`, `Email`, `ClassesID`, `Status`)"+
				"VALUES ( "+AdmissionNumber+", '"+StudentName+"','" +FatherName+"','"+DateOfBirth+"','"+Phone+"','"+Address+"','"+Email+"',"+ClassesID+","+Status+");";
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
