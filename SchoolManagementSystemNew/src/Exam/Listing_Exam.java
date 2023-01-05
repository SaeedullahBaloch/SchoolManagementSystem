package Exam;
import java.sql.*;


public class Listing_Exam
{
	public Exam_list[] listing_Exams()
	{ 


		try {
				
				Class.forName("com.mysql.jdbc.Driver");
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbschoolmanagement","root","");

				Statement stmt=con.createStatement();
				ResultSet rs=stmt.executeQuery("SELECT ExamID, Name, StartDate, EndDate,Status FROM `examination` ");
		
				
				
				int size =0;  
				if (rs != null)   
				{  
				rs.beforeFirst();  
				 rs.last();  
				size = rs.getRow();
				
				}
				
				
			
				
				rs.beforeFirst(); 
		
				
			
			Exam_list Exam[] = new Exam_list[size];
			
			
			int i=0;
				while(rs.next())
				{
					Exam[i] = new Exam_list();
					Exam[i].ExamID = Integer.parseInt(rs.getString(1).toString());					
					Exam[i].Name = rs.getString(2).toString();
					Exam[i].StartDate = rs.getString(3).toString();
					Exam[i].EndDate = rs.getString(4).toString();
					Exam[i].Status = rs.getString(5).toString();
			
					i++;
				}
				
				con.close();
				
				return Exam;

			}

			catch(Exception ex){
				System.out.println(ex);

			}

			return null;

		}
	
}