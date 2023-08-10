package com.adda.app.DAO.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.adda.app.Bean.Admin;
import com.adda.app.DAO.IAdminInterFace;
import com.adda.app.util.DbConnection;

public class IAdminInterfaceImpl implements IAdminInterFace {
	private static final String ADMIN_INSERT ="insert into user(u_name,u_email,u_address,u_mobile,u_psw,u_role) values(?,?,?,?,?,?)";
	private static final String ADMIN_VIEW="select*from user ";
	private static final String ADMIN_DELETE="delete from user where u_id=?";
	private static final String ADMIN_UID="select * from user where u_id=?";
	private static final String ADMIN_UPDATE="update user set u_name=?,u_email=?,u_address=?,u_mobile=?,u_psw=?,u_role=?where u_id=?";
	private static final String User_COUNT="Select count(u_id)from user where u_id!=? And u_role!=?";
    private Connection con=null;
    private PreparedStatement pstmt = null;
    private Admin admin=null;
    private ResultSet rs = null;
    
	@Override
	public Boolean save(Admin admin)   {
	
		con= DbConnection.getConnection();
		try {
		if(admin.getaId()==null)
		 {
			pstmt = con.prepareStatement(ADMIN_INSERT);
			System.out.println("inserted:->");
		 }
		else 
		{
			pstmt = con.prepareStatement(ADMIN_UPDATE);
			pstmt.setInt(7, admin.getaId());
		}
		pstmt.setString(1, admin.getaName());
		pstmt.setString(2, admin.getaEmail());
		pstmt.setString(3, admin.getaAddress());
		pstmt.setString(4, admin.getaMobile());
		pstmt.setString(5, admin.getaPassword());
		pstmt.setString(6, admin.getaRole());
		return pstmt.executeUpdate()>0;
		}
		catch(Exception e) 
		{
			e.printStackTrace();
		}
		return false;
	}


	@Override
	public List<Admin> viewAddminList() {
		con=DbConnection.getConnection();
		List <Admin>aList = new ArrayList();
	try {	pstmt = con.prepareStatement(ADMIN_VIEW);
		ResultSet rs = pstmt.executeQuery();
		while(rs.next()) 
		{
			 Admin u= new Admin();
			u.setaId(rs.getInt(1));
			u.setaName(rs.getString(2));
			u.setaEmail(rs.getString(3));
			u.setaAddress(rs.getString(4));
			u.setaMobile(rs.getString(5));
			u.setaPassword(rs.getString(6));
			u.setaRole(rs.getString(7));
			aList.add(u);		
		}
	}
	catch(Exception e) 
	{
		e.printStackTrace();
	}
		return aList;
	}

	@Override
	public Boolean deleteAdminById(Integer id) {
		con=DbConnection.getConnection();
		try {
			pstmt = con.prepareStatement(ADMIN_DELETE);
			pstmt.setInt(1, id);
			if(pstmt.executeUpdate()>0)
			{
				System.out.println("Deleted");
				return true;
			}	
			else
				 return false;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public Admin updateAdminById(Integer id) {
		con = DbConnection.getConnection();
		Admin u = new Admin();
		try {
			pstmt= con.prepareStatement(ADMIN_UID);
			pstmt.setInt(1, id);
		
			ResultSet rs = pstmt.executeQuery();
			rs.next();
			u.setaId(rs.getInt("u_id"));
			u.setaName(rs.getString("u_name"));
			u.setaEmail(rs.getString("u_email"));
			u.setaAddress(rs.getString("u_address"));
			u.setaMobile(rs.getString("u_mobile"));
			u.setaPassword(rs.getString("u_password"));
			u.setaRole(rs.getString("u_role"));
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return u;
	}
	
	public Integer countUser(Integer id) {
		con=DbConnection.getConnection();
		Integer i = null;
		try{
			pstmt = con.prepareStatement(User_COUNT);
			pstmt.setInt(1, id);
			pstmt.setString(2, "admin");
		  System.out.println(pstmt);
		  rs = pstmt.executeQuery();
           while(rs.next()) {
            
            i= rs.getInt(1);
           }
        System.out.println(i);
		}catch(Exception e) 
		{
			e.printStackTrace();
		}
		
		return i;
	}

}


