package com.adda.app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class selectBook {

	
		private static final String DB_URL ="jdbc:mysql://localhost:3306/addb";
		 private static final String DB_UNAME="root";
		 private static final String DB_PWD="PASSWORD123";
		 private static final String SELECT_SQL="SELECT * FROM books";
		public static void main(String[] args) throws Exception
		{  
			//1.Load the Driver class
			Class.forName("com.mysql.cj.jdbc.Driver");
			//2.Get Connection from databases
			Connection con = DriverManager.getConnection(DB_URL, DB_UNAME, DB_PWD);
			System.out.println(con);
			//3.Create Statement /preparedStatement /Callabletatement
			Statement stmt = con.createStatement();
			//4.Execute Query
	        ResultSet rs = stmt.executeQuery(SELECT_SQL);
	        //5.process Result
	        System.out.println("book ID----BOOK Name-----book Price");
	        while(rs.next()) 
	        {
	        	System.out.print(rs.getInt("book_id")+"----");
	        	System.out.print(rs.getString("book_name")+"----");
	        	System.out.println(rs.getInt("book_price")); 
	        }
	        con.close();
	}

}
