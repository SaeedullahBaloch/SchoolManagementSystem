package Teaching;

import java.sql.*;

public class TeacherListing {

	
	public ListTeachers[] listAllTeachers()
	{
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/schoolmanagmentdb","root","");

			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery("SELECT TeacherID, RegistrationNumber, Name, Father, DateOfBirth, Phone, CNIC, Qualification, Email, Address, RegistrationDate, Status FROM `teachers`");
	
			
			int size =0;  
			if (rs != null)   
			{  
			rs.beforeFirst();  
			 rs.last();  
			size = rs.getRow();
			}
			
			
		
			
			rs.beforeFirst(); 
			
			ListTeachers teacher[] = new ListTeachers[size];
		
		
		int i=0;
			while(rs.next())
			{
				
				teacher[i] = new ListTeachers();
				teacher[i].TeacherID = Integer.parseInt(rs.getString(1).toString());
				teacher[i].RegistrationNumber = Integer.parseInt(rs.getString(2).toString());
				teacher[i].Name = rs.getString(3).toString();
				teacher[i].Father = rs.getString(4).toString();
				teacher[i].DateOfBirth = rs.getString(5).toString();
				teacher[i].Phone = rs.getString(6).toString();
				teacher[i].CNIC = rs.getString(7).toString();
				teacher[i].Qualification = rs.getString(8).toString();
				teacher[i].Email = rs.getString(9).toString();
				teacher[i].Address = rs.getString(10).toString();
				teacher[i].RegistrationDate = rs.getString(11).toString();
				teacher[i].Status = rs.getString(12).toString();
				i++;
			}
			
			con.close();
			
			return teacher;

		}

		catch(Exception ex){
			System.out.println(ex);

		}

		return null;

	}
	
	
	
	
}
