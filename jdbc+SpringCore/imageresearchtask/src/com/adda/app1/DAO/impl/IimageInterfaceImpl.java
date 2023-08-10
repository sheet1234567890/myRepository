package com.adda.app1.DAO.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.adda.app1.imageresearch;
import com.adda.app1.DAO.IimageInterface;
import com.adda.app1.util.DB_CONNECTION;

public class IimageInterfaceImpl implements IimageInterface {
	private final String INSERT_SQL = "Insert into image values(?,?)";
	@Override
	public Boolean insertimage(imageresearch im) {
		
		// TODO Auto-generated method stub
		Connection con = DB_CONNECTION.Db_Connection();
		PreparedStatement pstmt = null;
		try {
			pstmt = con.prepareStatement(INSERT_SQL);
			pstmt.setString(1,im.getName());
			pstmt.setBlob(2, im.getBlob());
			if(pstmt.executeUpdate()>0)
				
				return true;
		} 
		catch (SQLException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		return false;
	}
}