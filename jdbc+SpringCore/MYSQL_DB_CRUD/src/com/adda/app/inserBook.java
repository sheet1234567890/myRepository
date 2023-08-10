package com.adda.app;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
public class inserBook 
{

	 private static final String DB_URL ="jdbc:mysql://localhost:3306/addb";
	 private static final String DB_UNAME="root";
	 private static final String DB_PWD="PASSWORD123";
	 private static final String INSERT_SQL="INSERT INTO books VALUES(108,'DBMSsss',30000000)";
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
        int rowsEffected = stmt.executeUpdate(INSERT_SQL);
        //5.process Result
        System.out.println("EffectedRows "+rowsEffected);
        con.close();
		
		
		
         
	}

}
