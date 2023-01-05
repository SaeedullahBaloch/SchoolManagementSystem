package Exam;
import java.sql.*;
public class Mark_listing {
	
	public Marks_list[] mark_listing()
	{ 
		try {
				
				Class.forName("com.mysql.jdbc.Driver");
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbschoolmanagement","root","");

				Statement stmt=con.createStatement();
				ResultSet rs=stmt.executeQuery("SELECT ExamID, students.StudentName, teachers.Name , TotalMarks,ObtainedMarks,Result \r\n" + 
						"FROM `marks` join students on students.StudentID = marks.StudentID join teachers on teachers.TeacherID = marks.TeacherID ");		
				int size =0;  
				if (rs != null)   
				{  
				rs.beforeFirst();  
				 rs.last();  
				size = rs.getRow();
				
				}
				rs.beforeFirst(); 
			Marks_list Mark[] = new Marks_list[size];
			int i=0;
				while(rs.next())
				{
					Mark[i] = new Marks_list();
					Mark[i].ExamID = Integer.parseInt(rs.getString(1).toString());					
					Mark[i].StudentID = rs.getString(2).toString();
					Mark[i].TeacherID = rs.getString(3).toString();
					Mark[i].TotalMarks = Integer.parseInt(rs.getString(4).toString());
					Mark[i].ObtainedMarks = Integer.parseInt(rs.getString(5).toString());
					Mark[i].Result= rs.getString(6).toString();
			
					i++;
				}
				
				con.close();
				
				return Mark;

			}

			catch(Exception ex){
				System.out.println(ex);

			}

			return null;

		}
	
}
