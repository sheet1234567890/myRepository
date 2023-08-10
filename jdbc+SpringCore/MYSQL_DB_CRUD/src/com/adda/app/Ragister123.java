package com.adda.app;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Ragister123 {
	 private static final String DB_URL ="jdbc:mysql://localhost:3306/ragistration";
	 private static final String DB_UNAME="root";
	 private static final String DB_PWD="PASSWORD123";
	 private static final String INSERT_SQL="INSERT INTO Student VALUES(1243,'patidarajesh@gmail.com','4321')";
	public static void main(String[] args)throws Exception{
		Class.forName("com.mysql.cj.jdbc.Driver");
	   Connection con = DriverManager.getConnection(DB_URL,DB_UNAME,DB_PWD);
       try { 
    	 Statement  stmt = con.createStatement();
    	   int rowEffected = stmt.executeUpdate(INSERT_SQL);
    	   System.out.println("data updated\nEffectedRows "+rowEffected);
       }
       catch(Exception e) {
          System.out.println("------------DUPLICATE NOT ALLOWD HERE---------");
       }
        con.close(); 
	}
}
