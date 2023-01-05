package Main;

import java.sql.*;

public class SearchStudents {


	public StudentList findStudents(int AdmissionNumber)
	{
		
		System.out.println(AdmissionNumber);
		try {

			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbschoolmanagement","root","");

			Statement stmt=con.createStatement();

			ResultSet rs=stmt.executeQuery("SELECT AdmissionNumber, StudentName, FatherName, DateOfBirth,Phone, Address,Email, class.Name as Class, Status\r\n" + 
					"FROM `students` \r\n" + 
					"join class on class.ClassID = students.ClassesID\r\n" + 
					"\r\n" + 
					"WHERE  AdmissionNumber = '"+AdmissionNumber+"'");


			StudentList student = new StudentList();
				
			
			rs.next();
			
			student.AdmissionNumber = Integer.parseInt(rs.getString(1));
			student.Name = rs.getString(2);
			student.Father = rs.getString(3);
			student.DOB = rs.getString(4);
			student.Phone = rs.getString(5);
			student.Address = rs.getString(6);
			student.Email = rs.getString(7);
			student.ClassID = rs.getString(8);
			student.Status =Integer.parseInt( rs.getString(9));
		
		
	

					con.close();
					return student;
			}


		catch(Exception ex)
		{
			System.out.println(ex);


		}
		return null;

		}


	}

