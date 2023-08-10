package com.adda.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class DB_Connection {
	private static final String DB_URL ="jdbc:mysql://localhost:3306/kul";
	 private static final String DB_UNAME="root";
	 private static final String DB_PWD="PASSWORD123";
	 public DB_Connection() {}
	 public static Connection Db_Connection() 
	 {
		 Connection con = null;
		 try {
			 Class.forName("com.mysql.cj.jdbc.Driver");
		 }
		 catch(Exception e) 
		 {
			 e.printStackTrace();
		 }
		 try {
			 con = DriverManager.getConnection(DB_URL, DB_UNAME, DB_PWD);
		 }
		 catch(Exception e) {
			 e.printStackTrace();
		 }
		 return con;
	 }
	
}
