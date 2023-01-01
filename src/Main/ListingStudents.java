package Main;

import java.sql.*;

public class ListingStudents {
	


	public StudentList[] listAllStudents()
	{
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbschoolmanagement","root","");

			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery("SELECT AdmissionNumber, StudentName, FatherName, DateOfBirth,Phone, Address,Email, classesID, Status FROM `students` ");
	
			
			
			int size =0;  
			if (rs != null)   
			{  
			rs.beforeFirst();  
			 rs.last();  
			size = rs.getRow();
			}
			
			
		
			
			rs.beforeFirst(); 
	
		StudentList students[] = new StudentList[size];
		
		
		int i=0;
			while(rs.next())
			{
				
				students[i] = new StudentList();
				
			
				students[i].AdmissionNumber = Integer.parseInt(rs.getString(1).toString());
				
				students[i].Name = rs.getString(2).toString();
				students[i].Father = rs.getString(3).toString();
				students[i].DOB = rs.getString(4).toString();
				students[i].Phone = rs.getString(5).toString();
				students[i].Address = rs.getString(6).toString();
				students[i].Email = rs.getString(7).toString();
				students[i].ClassID = rs.getString(8).toString();
				students[i].Status = Integer.parseInt( rs.getString(9).toString());
		
				i++;
			}
			
			con.close();
			
			return students;

		}

		catch(Exception ex){
			System.out.println(ex);

		}

		return null;

	}
	
	

}
