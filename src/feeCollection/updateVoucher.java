package feeCollection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class updateVoucher {

	
	
	
	public int collectStudentFee(int id, int studentID, String FeeMonth, String Date, int amount)
	{
		
		try
		{
				
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbschoolmanagement","root","");
				
			
			Statement stmt=con.createStatement();
			String query = "update fee set StudentID = '"+studentID+"', FeeMonth = '"+FeeMonth+"', Date = '"+Date+"', Amount = '"+amount+"' where FeeID = '"+id+"' ";
			
			
			System.out.println(query);
		int i=	stmt.executeUpdate(query);

		con.close();
		return i;
		
		}
		
		
		catch(Exception ex )
		{
			System.out.println(ex.getMessage());
		}
		
		return 0;
	}
}
