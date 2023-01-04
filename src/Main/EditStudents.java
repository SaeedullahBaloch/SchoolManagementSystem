package Main;

import java.sql.Connection;
import java.sql.DriverManager;

import java.sql.Statement;
public class EditStudents {
	
	
	
	
	public int editStudents(int AdmissionNumber,String StudentName, String Father, String DOB, String Phone, String Address, String Email, int ClassID, String status)
	{
	
try {
			
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbschoolmanagement","root","");
			
			
			Statement stmt=con.createStatement();
			
			
			
			String sql = "update students set StudentName = '"+StudentName+"', FatherName = '"+Father+"', DateOfBirth = '"+DOB+"',"
					+ "Phone = '"+Phone+"', Address = '"+Address+"',Email = '"+Email+"', ClassesID = '"+ClassID+"', Status = '"+status+"' where AdmissionNumber = '"+AdmissionNumber+"'";
			
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