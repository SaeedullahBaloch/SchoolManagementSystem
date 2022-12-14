package feeCollection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class ListingVoucher {
	
	
	public VoucherList[] vouchers()
	{
		
		try
		{
			
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbschoolmanagement","root","");
				
			
			Statement stmt=con.createStatement();
			
			
		ResultSet rs = stmt.executeQuery("select FeeID, students.StudentName, Date, FeeMonth, Amount \r\n" + 
				"from fee\r\n" + 
				"join students on students.StudentID = fee.StudentID");
			
			
		int size =0;  
		if (rs != null)   
		{  
		rs.beforeFirst();  
		 rs.last();  
		size = rs.getRow();
		}
		
		
	
		
		rs.beforeFirst(); 

			
			
			VoucherList[] listvouchers = new VoucherList[size];
			
			int i=0;
			
			while(rs.next())
			{
				listvouchers[i] = new VoucherList();	
				
				listvouchers[i].id = Integer.parseInt(rs.getString(1));
				listvouchers[i].StudentName = rs.getString(2);
				listvouchers[i].FeeMonth = rs.getString(3);
				listvouchers[i].Date = rs.getString(4);
				listvouchers[i].amount = Integer.parseInt(rs.getString(5));
				i++;
			}
			
			return listvouchers;
			
			
			
		}
		
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		return null;
		
	}

}
