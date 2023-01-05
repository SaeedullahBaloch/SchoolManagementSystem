package feeCollection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class SearchVoucher {
	
	
	public VoucherList getVoucher(int id)
	{
		
		try
		{
				
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbschoolmanagement","root","");
				
			
			Statement stmt=con.createStatement();
			
			
			ResultSet rs = stmt.executeQuery("select * from fee where FeeID = '"+id+"'");
		
		rs.next();
		
	
		VoucherList vl = new VoucherList();
		vl.id = Integer.parseInt(rs.getString(1));
		vl.StudentName = rs.getString(2).toString();
		vl.FeeMonth = rs.getString(3).toString();
		vl.Date = rs.getString(4).toString();
		vl.amount = Integer.parseInt(rs.getString(5));
		
		con.close();
		return vl;
		
		}
		
		
		catch(Exception ex )
		{
			System.out.println(ex.getMessage());
		}
		
		return null;
	}
	
	
	

}
