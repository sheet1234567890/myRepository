package com.adda.app.DAO.impl;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.adda.app.EmployeeWorklocation;
import com.adda.app.DAO.IEmpW_Cinterface;
import com.adda.app.util.DbConnection;
import com.adda.app.EmployeeWorklocation;

public class IEmpW_Cinterfaceimpl implements IEmpW_Cinterface {
 private final String WORKLOCATION_EMP_LIST="Call listEmp1(?)";
 private final String JOIN_DATE_EMP_LIST="Call emp_bt_Date(?,?)";
 private final String WCLOCATION_LIST="select * from empretrive where e_worklocation in(?,?)";
 private final String CL_WCLOCATION_LIST2="call workLocationFindEmployee()";
 
	public List<EmployeeWorklocation> workLocation(String Worklocation) throws SQLException {
		List <EmployeeWorklocation> lists=new ArrayList();
		Connection con = DbConnection.Db_Connection();
		CallableStatement csmt= con.prepareCall(WORKLOCATION_EMP_LIST);
		csmt.setString(1,Worklocation);
		ResultSet rs=csmt.executeQuery();
		while(rs.next()) 
		{
			EmployeeWorklocation e = new EmployeeWorklocation();
			e.setE_id(rs.getInt(1));
			e.setE_name(rs.getString(2));
			e.setE_email(rs.getString(3));
			e.setE_join_date(rs.getString(4));
			e.setE_worklocation(rs.getString(5));
			lists.add(e);
		}
		System.out.println(lists);
		return lists;
		// TODO Auto-generated method stub
		 
	}

	@Override
	public List<EmployeeWorklocation> joinDate(String join_date1, String join_date2) throws SQLException {
		List <EmployeeWorklocation> lists=new ArrayList();
		Connection con = DbConnection.Db_Connection();
		CallableStatement csmt= con.prepareCall(JOIN_DATE_EMP_LIST);
		csmt.setString(1,join_date1);
		csmt.setString(2,join_date2);
		ResultSet rs = csmt.executeQuery();
		while(rs.next())
		{
			EmployeeWorklocation e = new EmployeeWorklocation();
			e.setE_id(rs.getInt(1));
			e.setE_name(rs.getString(2));
			e.setE_email(rs.getString(3));
			e.setE_join_date(rs.getString(4));
			e.setE_worklocation(rs.getString(5));
			lists.add(e);
		}
		System.out.println(lists);
		return lists;
	}

	@Override
	public List<EmployeeWorklocation> workLocation2(String wlocation1, String wlocation2) throws SQLException {
		// TODO Auto-generated method stub
		List <EmployeeWorklocation> l = new ArrayList();
		Connection con = DbConnection.Db_Connection();
		PreparedStatement pstmt = con.prepareStatement(WCLOCATION_LIST);
		pstmt.setString(1,wlocation1);
		pstmt.setString(2, wlocation2);
		ResultSet rs = pstmt.executeQuery();
		while(rs.next()) 
		{
			EmployeeWorklocation wl =  new EmployeeWorklocation();
			wl.setE_id(rs.getInt(1));
			wl.setE_name(rs.getString(2));
			wl.setE_email(rs.getString(3));
			wl.setE_join_date(rs.getString(4));
			wl.setE_worklocation(rs.getString(5));
			l.add(wl);
			
		}
		return l;
	}
	public List<EmployeeWorklocation>clWorkLocation() throws SQLException
	{
		List <EmployeeWorklocation> l = new ArrayList();
		Connection con = DbConnection.Db_Connection();
		CallableStatement csmt= con.prepareCall(CL_WCLOCATION_LIST2);
		ResultSet rs = csmt.executeQuery();
		while(rs.next())
		{
			EmployeeWorklocation e =  new EmployeeWorklocation();
			e.setE_id(rs.getInt(1));
			e.setE_name(rs.getString(2));
			e.setE_email(rs.getString(3));
			e.setE_join_date(rs.getString(4));
			e.setE_worklocation(rs.getString(5));
			l.add(e);
		}
		return l;
		
	}
	
	}


