package com.adda.app.DAO.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.adda.app.Bean.Contect;
import com.adda.app.DAO.IContectInterface;
import com.adda.app.util.DbConnection;

public class IContectInterfaceImpl implements IContectInterface {
	private static final String INSERT_CONTECT = "Insert into Contect(c_name,c_email,c_mobile,c_address,c_isfav,u_id,c_id) values(?,?,?,?,?,?,?)";
	private static final String UPDATE_CONTECT = "update Contect set c_name=?,c_email=?,c_mobile=?,c_address=? where c_id=?";
	private static final String CONTECT_BYID = "Select  * from Contect where c_id=?";
	private static final String DELETE_CONTECT = "delete from Contect where c_id=?";
	private static final String VIEW_CONTECT = "select*from Contect where u_id=?";
	private static final String CON_FAV = "update Contect set c_isfav=? where c_id=?";
	private static final String TOTAL_CON="select count(c_id)from contect where u_id=?";
	private Connection con = null;
	private PreparedStatement pstmt = null;

	@Override
	public Boolean save(Contect contect) {
		con = DbConnection.getConnection();
		Integer max = 100000000;
		Integer min = 0;
		if (contect.getcId() == null) {
			try {
				pstmt = con.prepareStatement(INSERT_CONTECT);
				pstmt.setString(1, contect.getcName());
				pstmt.setString(2, contect.getcEmail());
				pstmt.setString(3, contect.getcMobile());
				pstmt.setString(4, contect.getcAddress());
				pstmt.setBoolean(5, contect.getcIsfav());
				pstmt.setInt(6, contect.getCuId());
				pstmt.setInt(7, (int) (Math.random() * (max - min + 1) + min));

			} catch (SQLException e) {
				
				e.printStackTrace();
			}
		} else {
			try {
				pstmt = con.prepareStatement(UPDATE_CONTECT);
				pstmt.setInt(5, contect.getcId());
				pstmt.setString(1, contect.getcName());
				pstmt.setString(2, contect.getcEmail());
				pstmt.setString(3, contect.getcMobile());
				pstmt.setString(4, contect.getcAddress());
				System.out.println(pstmt);

			} catch (SQLException e) {
				
				e.printStackTrace();
			}

		}
		try {

			if (pstmt.executeUpdate() > 0) {
				return true;
			} else {
				return false;
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}

		return null;
	}

	@Override
	public List<Contect> viewAllContect(Integer id) {
		con = DbConnection.getConnection();
		List<Contect> conList = new ArrayList();
		try {
			pstmt = con.prepareStatement(VIEW_CONTECT);
			pstmt.setInt(1, id);
			System.out.println(pstmt+"                    *******************");
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				Contect c1 = new Contect();
				c1.setcId(rs.getInt("c_id"));
				c1.setcName(rs.getString("c_name"));
				c1.setcEmail(rs.getString("c_email"));
				c1.setcMobile(rs.getString("c_mobile"));
				c1.setcAddress(rs.getString("c_address"));
				c1.setcIsfav(rs.getBoolean("c_isfav"));
				c1.setCuId(rs.getInt("u_id"));
              
				conList.add(c1);

			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(conList);
		return conList;
	}

	@Override
	public Boolean deleteContectById(Integer id) {
		con = DbConnection.getConnection();
		try {
			pstmt = con.prepareStatement(DELETE_CONTECT);
			pstmt.setInt(1, id);
			if (pstmt.executeUpdate() > 0) {
				System.out.println("delete data");
				return true;
			}

		} catch (SQLException e) {

			e.printStackTrace();
		}

		return false;
	}

	@Override
	public Contect updateContectById(Integer id) {
		con = DbConnection.getConnection();
		try {
			pstmt = con.prepareStatement(CONTECT_BYID);
			Contect contect = new Contect();
			pstmt.setInt(1, id);
			ResultSet rs = pstmt.executeQuery();
			rs.next();
			contect.setcId(rs.getInt("c_id"));
			contect.setcName(rs.getString("c_name"));
			contect.setcEmail(rs.getString("c_email"));
			contect.setcMobile(rs.getString("c_mobile"));
			contect.setcAddress(rs.getString("c_address"));
			contect.setcIsfav(rs.getBoolean("c_isfav"));
			contect.setCuId(rs.getInt("u_id"));

			System.out.println(contect);
			return contect;

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public Boolean isContactFav(Integer id, Boolean conisfav) {
		con = DbConnection.getConnection();
		Integer i = 0;
		try {
			pstmt = con.prepareStatement(CON_FAV);
			pstmt.setBoolean(1, conisfav);
			pstmt.setInt(2, id);
			System.out.println(pstmt);
			i = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		if (i > 0) {
			System.out.println("favoraite");
			return true;
		}
		System.out.println("no.....");
		return false;
	}

	@Override
	public Integer TotalContect(Integer id) {
		con = DbConnection.getConnection();
		Integer count=0;
		try {
		pstmt= con.prepareStatement(TOTAL_CON);
		pstmt.setInt(1, id);
		System.out.println(pstmt);
		 ResultSet rs=pstmt.executeQuery();
		while(rs.next()) 
		{
			count = rs.getInt(1);
		}
		}
		catch(Exception e) 
		{
			e.printStackTrace();
		}
		System.out.println(count);
		return count;
	}
}
