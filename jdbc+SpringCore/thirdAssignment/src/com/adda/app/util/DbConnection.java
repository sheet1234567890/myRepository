package com.adda.app.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DbConnection {
	 private static final String DB_URL ="jdbc:mysql://localhost:3306/ragistration";
	 private static final String DB_UNAME="root";
	 private static final String DB_PWD="PASSWORD123";
	 public DbConnection() {}
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

