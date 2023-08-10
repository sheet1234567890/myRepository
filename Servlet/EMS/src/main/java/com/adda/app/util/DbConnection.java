package com.adda.app.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbConnection {
	private static final String DB_URL="jdbc:mysql://localhost:3306/ragistration123";
	private static final String DB_USER="root";
	private static final String DB_PSW="PASSWORD123";
	private static final String DRIVER="com.mysql.cj.jdbc.Driver";
	
		  
		  private static Connection con=null;
		  public static Connection getConnection()
		  {
			  if(con!=null)
				  return con;
			  return getConnection(DB_URL,DB_USER,DB_PSW);
		  }
		private static Connection getConnection(String dbUrl, String dbUser, String dbPsw) {
			try {
				Class.forName(DRIVER);
				con= DriverManager.getConnection(dbUrl, dbUser, dbPsw);
			} catch (Exception e) {
				
				e.printStackTrace();
			}
			return con;
		}
	}


