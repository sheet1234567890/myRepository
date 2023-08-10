package com.adda.app1.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class DB_CONNECTION {
	private static final String DB_URL ="jdbc:mysql://localhost:3306/addb";
	 private static final String DB_UNAME="root";
	 private static final String DB_PWD="PASSWORD123";
	 private static Connection con;
	 public DB_CONNECTION() {}
	 public static Connection Db_Connection() 
	 {
		 
		 if(con==null)
		 try {
			 Class.forName("com.mysql.cj.jdbc.Driver");
			 con = DriverManager.getConnection(DB_URL, DB_UNAME, DB_PWD);
		 }
		 catch(Exception e) 
		 {
			 e.printStackTrace();
		 }
		
		 
		 return con;
	 }
}
