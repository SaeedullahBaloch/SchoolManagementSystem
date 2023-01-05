package Exam;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Change_Exam_Status {

	
	
	public int changeStatus(int id, String status)
	{
		
	
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con =
			DriverManager.getConnection("jdbc:mysql://localhost:3306/dbschoolmanagement","root","");
			Statement stmt=con.createStatement();
			String Query ="Update examination set status = '"+status+"' where ExamID = '"+id+"'; ";
			stmt.executeUpdate(Query);
			
	
			con.close();
			} catch(Exception e)
			{
			System.out.println(e);
			}
return 0;
	}

}
