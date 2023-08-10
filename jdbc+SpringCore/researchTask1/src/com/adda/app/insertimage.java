package com.adda.app;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class insertimage {
   public static void main(String[] args) throws ClassNotFoundException, SQLException, FileNotFoundException {
	
	   Class.forName("com.mysql.cj.jdbc.Driver");
	   Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/addb", "root" ,"PASSWORD123");
	   PreparedStatement pstmt = con.prepareStatement("Insert into image values(?,?)"); 
	   pstmt.setString(1,"sheetal");
	   InputStream in = new FileInputStream("C:\\Users\\Kdpat\\OneDrive\\Desktop\\Redmi 9power\\9106.jpg ");
	   pstmt.setBlob(2, in);
	   pstmt.execute();
}
}
