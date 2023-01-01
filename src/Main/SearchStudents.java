package Main;

import java.sql.*;

public class SearchStudents {


	public String findStudents(int AdmissionNumber)
	{
		try {

			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbschoolmanagement","root","");


			Statement stmt=con.createStatement();

			ResultSet rs=stmt.executeQuery("SELECT AdmissionNumber, StudentName, FatherName, DateOfBirth,Phone, Address,Email, class.Name as Class\r\n" + 
					"FROM `students` \r\n" + 
					"join class on class.ClassID = students.ClassesID\r\n" + 
					"\r\n" + 
					"WHERE Status = 1 AND AdmissionNumber = '"+AdmissionNumber+"'");



			rs.next();

			String Student = "Student Info : " + rs.getString(2) + rs.getString(3) +rs.getString(4) +rs.getString(5)+ rs.getString(6) +
					rs.getString(7) +rs.getString(7)+rs.getString(8);


					con.close();
					return Student;
			}


		catch(Exception ex)
		{
			System.out.println(ex);


		}
		return "";

		}


	}

