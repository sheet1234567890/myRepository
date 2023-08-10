package com.adda.app.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {
    private  static final String DB_URL="jdbc:mysql://localhost:3306/phonebook";
    private static final String DB_USER="root";
    private static final String DB_PSW="PASSWORD123";
    private static final String DRIVER="com.mysql.cj.jdbc.Driver";
    
    private static Connection con =null;
    public static Connection getConnection() 
    {
    	if(con!=null)
		return con;
    return getConnection(DB_URL,DB_USER,DB_PSW);
    	
    }
    private static Connection getConnection(String url,String user,String psw) 
    {
    	try {
			Class.forName(DRIVER);
			con = DriverManager.getConnection(url, user, psw);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	return con;
    }

}
