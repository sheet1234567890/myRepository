package com.adda.app.DAO.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.adda.app.Bean.Employee;
import com.adda.app.DAO.IEmpInterface;
import com.adda.app.util.DbConnection;

public class EmpInterfaceimpl implements IEmpInterface {
	private static final String INSERT_EMP="INSERT INTO EMP(eName,eSal,eDepart)values(?,?,?)";
	private static final String UPDATE_EMP="Update Emp set eName=?,eSal=?,eDepart=?where eId=?";
	private static final String VIEW_EMP="select*from Emp";
	private static final String DELETE_EMP="Delete from Emp where eId =?";
	private static final String UPDATE_BY_ID="Select*from Emp where eId=?";
    private Connection con = null;
    private PreparedStatement pstmt = null;
	@Override
	public Boolean save(Employee employee) {
		con=DbConnection.getConnection();
		Integer i = null;
		try {
		if(employee.getE_id()==null) 
		{
			pstmt = con.prepareStatement(INSERT_EMP);
			System.out.println("inserted");
			
		}
		else 
		{
			pstmt = con.prepareStatement(UPDATE_EMP);
			pstmt.setInt(4, employee.getE_id());
			System.out.println("updated");
		}
		pstmt.setString(1, employee.getE_name());
		pstmt.setDouble(2,employee.getE_sal());
		pstmt.setString(3, employee.getE_depart());
		i=pstmt.executeUpdate();
		}
		catch(Exception e) 
		{
			e.printStackTrace();
		}
		if(i>0) 
		{
			return true;
		}
		return false;
	}

	@Override
	public List<Employee> viewAllEmployee() {
		con = DbConnection.getConnection();
		List<Employee>eList =  new ArrayList();
		try {
		pstmt= con.prepareStatement(VIEW_EMP);
		ResultSet rs = pstmt.executeQuery();
		while(rs.next()) 
		{
			Employee emp = new Employee();
			emp.setE_id(rs.getInt("eId"));
			emp.setE_name(rs.getString("eName"));
			emp.setE_sal(rs.getDouble("eSal"));
			emp.setE_depart(rs.getString("eDepart"));
			eList.add(emp);
		}
		}
		catch(Exception e) 
		{
			e.printStackTrace();
		}
		return eList;
	}

	@Override
	public Boolean deleteEmployeeById(Integer id) {
		con=DbConnection.getConnection();
		
		try {
		pstmt=con.prepareStatement(DELETE_EMP);
		pstmt.setInt(1, id);
		if(pstmt.executeUpdate()>0) {
			System.out.println("Deleted");	
		}
		}
		catch(Exception e) 
		{
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public Employee updateByIdEmployee(Integer id) {
		con  = DbConnection.getConnection();
		Employee emp = new Employee();
		try 
		{
		pstmt=con.prepareStatement(UPDATE_BY_ID);
		pstmt.setInt(1, id);
		ResultSet rs = pstmt.executeQuery();
		rs.next();
		emp.setE_id(rs.getInt("eId"));
		emp.setE_name(rs.getString("eName"));
		emp.setE_sal(rs.getDouble("eSal"));
		emp.setE_depart(rs.getString("eDepart"));
		}
		catch(Exception e) 
		{
			e.printStackTrace();
		}
		return emp;
	}

}
