package Teaching;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class update {
	public int updateTeacher(int TeacherID,int RegistrationNumber,String Name,String Father, String DateOfBirth, String Phone, String CNIC,
			String Qualification,String Email,String Address,String RegistrationDate,String Status)
	{
	
try {
			
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbschoolmanagement","root","");
			
			
			Statement stmt=con.createStatement();
			
			
			
			String sql = "UPDATE teachers SET TeacherID = '"+TeacherID+"', RegistrationNumber = '"+RegistrationNumber+"', Name = '"+Name+"',"
					+ "Father = '"+Father+"', DateOfBirth = '"+DateOfBirth+"',Phone = '"+Phone+"', CNIC = '"+CNIC+"', Qualification = '"+Qualification+"', Email = '"+Email+"', Address = '"+Address+"' , RegistrationDate = '"+RegistrationDate+"', Status = '"+Status+"' where TeacherID = '"+TeacherID+"'";
			
		int rs =	stmt.executeUpdate(sql);

			
			
		System.out.println(rs);
			
					con.close();
					
					return rs;
			}
			
		
		catch(Exception ex)
		{
			System.out.println(ex);
			
			
		}
return 0;
				
		}

		
		
	}

