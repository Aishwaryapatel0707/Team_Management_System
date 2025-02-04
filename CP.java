package com.team.manage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CP
{	 
	static Connection con;
	
    public static Connection createC() throws SQLException
    {
    	try 
    	{
  			Class.forName("com.mysql.cj.jdbc.Driver");
			
			String url = "jdbc:mysql://localhost:3306/TeamManagement";
			
			String user = "root";
			
			String password = "772002";
			
			con = DriverManager.getConnection(url, user, password);
		} 
    	catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
    	
    	return con;
    	
    }
}
