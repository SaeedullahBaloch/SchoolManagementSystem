package Teaching;
import java.sql.*;

public class SearchTeacher {


		public ListTeachers findTeachers(int TeacherID)
		{
			try {

				Class.forName("com.mysql.jdbc.Driver");
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbschoolmanagement","root","");


				Statement stmt=con.createStatement();

				ResultSet rs=stmt.executeQuery("SELECT * FROM teachers WHERE TeacherID = '"+TeacherID+"'");



			
				ListTeachers teacher= new ListTeachers();
				
				rs.next();
				
			
				teacher.TeacherID = Integer.parseInt(rs.getString(1).toString());
				teacher.RegistrationNumber = Integer.parseInt(rs.getString(2).toString());
				teacher.Name = rs.getString(3).toString();
				teacher.Father = rs.getString(4).toString();
				teacher.DateOfBirth = rs.getString(5).toString();
				teacher.Phone = rs.getString(6).toString();
				teacher.CNIC = rs.getString(7).toString();
				teacher.Qualification = rs.getString(8).toString();
				teacher.Email = rs.getString(9).toString();
				teacher.Address = rs.getString(10).toString();
				teacher.RegistrationDate = rs.getString(11).toString();
				teacher.Status = rs.getString(12);
			
				return teacher;
				}


			catch(Exception ex)
			{
				System.out.println(ex);


			}
			return null;

			}


		}



