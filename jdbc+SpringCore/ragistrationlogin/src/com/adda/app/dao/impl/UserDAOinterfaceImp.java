package com.adda.app.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.adda.app.util.DbConnection;
import com.mysql.cj.jdbc.JdbcPreparedStatement;

import java.sql.Statement;
import com.adda.app.bean.User;
import com.adda.app.dao.UserDAOinterface;

public class UserDAOinterfaceImp  implements UserDAOinterface{
	private final String INSERT_SQL="INSERT INTO User VALUES(?,?,?,?,?,?)";
	private final String UPDATE_SQl="UPDATE user set uEmail=? ,uPassword=? where uId=?";
	private final String SOFT_DEL="UPDATE user set status=0 where id =? ";
	//private final String SELECT_USER="SELECT * from user ";
	private final String CREATE_TABLE="create table youtube(y_id int(20)primary key ,y_name varchar(255))";
	
	public Boolean login(String email, String password)throws SQLException {
		final String SELECT_USER ="SELECT uEmail,uPassword from user ";
		Connection con = DbConnection.Db_Connection();
		//Statement stmt = con.createStatement();
		PreparedStatement pstmt = con.prepareStatement(SELECT_USER);;
		ResultSet rs = pstmt.executeQuery();

		  while( rs.next())
			if(rs.getString("uEmail").hashCode()==(email).hashCode()) {
				if(rs.getString("uPassword").hashCode()==(password).hashCode()) {
				return true;
				}
			}
		
		return false;
		//;
 	//return null;
	}
	
	@Override
	public Boolean Signup(User user) throws SQLException{
		
		//final String INSERT_SQL="INSERT INTO User VALUES('"+user.getuId()+"','"+user.getuName()+"','"+user.getuEmail()+"','"+user.getuPassword()+"','"+user.getuAddress()+"','"+user.getStatus()+'";
		Connection con = DbConnection.Db_Connection();
		//Statement stmt = con.createStatement();
	    PreparedStatement pstmt = con.prepareStatement(INSERT_SQL);
	    pstmt.setInt(1, user.getuId());
	    pstmt.setString(2,user.getuName() );
	    pstmt.setString(3,user.getuEmail());
	    pstmt.setString(4, user.getuPassword());
	    pstmt.setString(5, user.getuAddress());
	    pstmt.setInt(6,user.getStatus());
		return pstmt.executeUpdate()>0;
		
		
	}
	public Boolean Update(User user) throws SQLException {
		Connection con = DbConnection.Db_Connection();
		PreparedStatement pstmt1 = con.prepareStatement(UPDATE_SQl);
		pstmt1.setString(1,user.getuEmail());
		pstmt1.setString(2, user.getuPassword());
		pstmt1.setInt(3, user.getuId());
		return pstmt1.executeUpdate()>0;
		
	}
	public Boolean SoftDelet(User user)throws SQLException
	{
		Connection con = DbConnection.Db_Connection();
		PreparedStatement pstmt1=null;
		try {
		pstmt1 = con.prepareStatement(SOFT_DEL);
		pstmt1.setInt(1,user.getStatus());
	    pstmt1.setInt(2, user.getuId());
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		try {
	    pstmt1.executeUpdate();
	    return true;
	}catch(SQLException e) 
		{
		e.printStackTrace();
		}
		return false;
		}

	@Override
	public Boolean CreateTable() throws SQLException {
		// TODO Auto-generated method stub
		Connection con = DbConnection.Db_Connection();
		Statement stmt = con.createStatement();
	if(	stmt.executeUpdate(CREATE_TABLE)>0)
	
		return true;
	else
	return false;
	}

	@Override
	public void Data() throws Exception {
		Connection con = DbConnection.Db_Connection();
		Statement stmt = con.createStatement();
		
		ResultSet rs = stmt.executeQuery("Select * from user");
		while(rs.next()) 
		{
			System.out.println(rs.getInt(1)+"----"+rs.getString(2)+"----"+rs.getString(3)+"----"+rs.getString(4)+"----"+rs.getString(5)+"----"+rs.getInt(6));
		}
		
	}


	
}

	
