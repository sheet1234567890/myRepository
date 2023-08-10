package com.adda.app.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbConnection {
	
	private static final String DB_URL="jdbc:mysql://localhost:3306/HumanDb";
	private static final String DB_UNAME="root";
	private static final String DB_PASS="PASSWORD123";
	
	private static Connection con;
	
	public DbConnection() {}
	
	public static Connection Dbconnection() 
	{
		if(con==null) 
		{
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				con = DriverManager.getConnection(DB_URL, DB_UNAME, DB_PASS);
				}
				catch(Exception e) 
				{
					e.printStackTrace();
					
				}
		}
		System.out.println(con);
		return con;
		}

}
