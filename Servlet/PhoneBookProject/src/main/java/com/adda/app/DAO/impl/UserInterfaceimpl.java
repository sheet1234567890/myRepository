package com.adda.app.DAO.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.adda.app.Bean.User;
import com.adda.app.DAO.IUserInterface;
import com.adda.app.util.DbConnection;
import com.mysql.cj.protocol.Resultset;
import com.mysql.cj.x.protobuf.MysqlxPrepare.Execute;

public class UserInterfaceimpl implements IUserInterface {
	private static final String USER_INSERT = "insert into user(u_name,u_email,u_address,u_mobile,u_password,u_role,u_id) values(?,?,?,?,?,?,?)";
	private static final String USER_VIEW = "select*from user where u_role=? ";
	private static final String USER_DELETE = "delete from user where u_id=?";
	private static final String USER_UID = "select * from user where u_id=?";
	private static final String LOGIN_USER = "Select * from user where u_email=? AND u_password=?";
	private static final String USER_UPDATE = "update user set u_name=?,u_email=?,u_address=?,u_mobile=? ,u_role=? where u_id=?";
	private static final String CHANG_PASS = "update user set u_password=? where u_id=? AND u_password=?";
    private static final String CHEAK_EMAIL="select u_id from user where  u_email=?";
    private static final String CHEAK_PASS="select * from user where u_password=? and u_id=?";
	private Connection con = null;
	private PreparedStatement pstmt = null;
    private ResultSet rs = null;
	@Override
	public Boolean save(User user) {
		System.out.println(user);
		con = DbConnection.getConnection();
		Integer max = 100000000;
		Integer min = 0;

		try {
			if (user.getuId() == null) {
				pstmt = con.prepareStatement(USER_INSERT);
				pstmt.setString(1, user.getuName());
				pstmt.setString(2, user.getuEmail());
				pstmt.setString(3, user.getuAddress());
				pstmt.setString(4, user.getuMobile());
				pstmt.setString(5, user.getuPassword());
				pstmt.setString(6, user.getuRole());
				pstmt.setInt(7, (int) (Math.random() * (max - min + 1) + min));
				System.out.println(pstmt);
			} else {
				pstmt = con.prepareStatement(USER_UPDATE);
				pstmt.setInt(6, user.getuId());
				pstmt.setString(1, user.getuName());
				pstmt.setString(2, user.getuEmail());
				pstmt.setString(3, user.getuAddress());
				pstmt.setString(4, user.getuMobile());
				pstmt.setString(5, user.getuRole());
          
				System.out.println(pstmt);
				System.out.println("update");
			}

			if (pstmt.executeUpdate() > 0) {
				return true;
			} else {
				return false;
			}
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}

	}

	@Override
	public List<User> viewAllUser(String role) {
		con = DbConnection.getConnection();
		List<User> userList = new ArrayList();
		try {
			pstmt = con.prepareStatement(USER_VIEW);
			pstmt.setString(1, role);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				User u = new User();
				u.setuId(rs.getInt(1));
				u.setuName(rs.getString(2));
				u.setuEmail(rs.getString(3));
				u.setuAddress(rs.getString(4));
				u.setuMobile(rs.getString(5));
				u.setuPassword(rs.getString(6));
				u.setuRole(rs.getString(7));
				userList.add(u);
			}
		} catch (SQLException e) {

			e.printStackTrace();
		}

		return userList;
	}

	@Override
	public Boolean deleteById(Integer id) {
		con = DbConnection.getConnection();
		try {
			pstmt = con.prepareStatement(USER_DELETE);
			pstmt.setInt(1, id);
			if (pstmt.executeUpdate() > 0) {
				System.out.println("Delete details");
				return true;
			} else {
				System.out.println("not delete");
				return false;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public User updateById(Integer id) {
		con = DbConnection.getConnection();
		User u = new User();
		try {
			pstmt = con.prepareStatement(USER_UID);
			pstmt.setInt(1, id);
			System.out.println(pstmt);
			ResultSet rs = pstmt.executeQuery();
			rs.next();

			u.setuId(rs.getInt("u_id"));
			u.setuName(rs.getString("u_name"));
			u.setuEmail(rs.getString("u_email"));
			u.setuAddress(rs.getString("u_address"));
			u.setuMobile(rs.getString("u_mobile"));
			u.setuPassword(rs.getString("u_password"));
			u.setuRole(rs.getString("u_role"));

		} catch (SQLException e) {
			e.printStackTrace();
		}
		System.out.println(u);
		return u;
	}

	public User LoginUser(String email, String password) {
		con = DbConnection.getConnection();
		User u = new User();
		try {
			pstmt = con.prepareStatement(LOGIN_USER);
			pstmt.setString(1, email);
			pstmt.setString(2, password);
			System.out.println(pstmt);
			ResultSet rs = pstmt.executeQuery();
			if (rs.next()) {
				u.setuId(rs.getInt("u_id"));
				u.setuName(rs.getString("u_name"));
				u.setuEmail(rs.getString("u_email"));
				u.setuAddress(rs.getString("u_address"));
				u.setuMobile(rs.getString("u_mobile"));
				u.setuPassword(rs.getString("u_password"));
				u.setuRole(rs.getString("u_role"));

			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return u;

	}

	@Override
	public Boolean changPassword(String oldpass, String newpass, Integer id) {
		con = DbConnection.getConnection();
		Integer i = 0;
		try {
			pstmt = con.prepareStatement(CHANG_PASS);
			pstmt.setString(1, newpass);
			pstmt.setString(3, oldpass);
			pstmt.setInt(2, id);
			System.out.println(pstmt);
			i = pstmt.executeUpdate();
			System.out.println(i + " ....... ");
		} catch (Exception e) {
			e.printStackTrace();
		}
		if (i > 0) {
			System.out.println("Change Password");
			return true;
		}
		System.out.println("NOT CHANGE");
		return false;
	}

	@Override
	public Integer cheakEmail(String email) {
		con=DbConnection.getConnection();
	   try {
		pstmt=con.prepareStatement(CHEAK_EMAIL);
		pstmt.setString(1, email);
		rs=pstmt.executeQuery();
		if(rs.next()) 
		{
			return rs.getInt("u_id");
		}
		else 
		{
			return -1;
		}
	   }
	   catch(Exception e) 
	   {
		   e.printStackTrace();
		   return -1;
	   }
		
	}

	@Override
	public Boolean CheakPass(String pass,Integer id) {
		con=DbConnection.getConnection();
		try {
		pstmt = con.prepareStatement(CHEAK_PASS);
		pstmt.setString(1, pass);
		pstmt.setInt(2, id);
		System.out.println(pstmt);
		rs=pstmt.executeQuery();
		if(rs.next()) 
		{
			return true;
		}
		else 
		{
			return false;
		}
		}
		catch(Exception e) 
		{
			e.printStackTrace();
			return false;
		}
		
	}
	}


