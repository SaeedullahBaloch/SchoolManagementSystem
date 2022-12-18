package feeCollection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class SearchVoucher {
	
	
	public String getVoucher(int id)
	{
		
		try
		{
				
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbschoolmanagement","root","");
				
			
			Statement stmt=con.createStatement();
			
			
		ResultSet rs = stmt.executeQuery("select * from fee where FeeID = '"+id+"'");
		
		rs.next();
		
		String Receipt = rs.getString(0).toString() + rs.getString(1).toString() + rs.getString(2).toString() + rs.getString(3).toString() + rs.getString(4).toString();
		con.close();
		return Receipt;
		
		}
		
		
		catch(Exception ex )
		{
			System.out.println(ex.getMessage());
		}
		
		return "";
	}
	
	
	

}
