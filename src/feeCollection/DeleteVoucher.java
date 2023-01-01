package feeCollection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DeleteVoucher {

	
	public int deleteVoucher(int id)
	{
		
		
		try
		{
			
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbschoolmanagement","root","");
			
			
			Statement stmt=con.createStatement();
			
			
			
			String sql = "delete from fee where FeeID = '"+id+"'"; 
			
		int rs =	stmt.executeUpdate(sql);

		return rs;
			
		}
		
		
		catch (Exception e) {
			
			System.out.println(e.getMessage());
		}
		
		return 0;
		
	}

	
}
