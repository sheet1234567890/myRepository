package com.adda.DAO.impl;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.adda.DAO.EmpDAOinterface;
import com.adda.bean.Employee;
import com.adda.util.DB_Connection;

public class EmpDAOimpl implements EmpDAOinterface {

	private final String INSERT_SQL = "INSERT INTO employee VALUES(?,?,?,?,?)";
	private final String SOFT_DELETE = "Update employee set e_status=? where e_id= ? and e_status=?";
	private final String UPDATE_SALARY = "Update employee set e_sal=? where e_id =? and e_status=1";
	private final String SELECT_HIKE = "Select*from department where d_id in(Select d_id from employee where e_id=? and e_status=1)";
	private final String SELECT_SALARY = "select * from employee where e_id=? and e_status=1";
	private final String CS_SELLECT_SALARY = "call Selectsalary(?)";
	

	public Boolean signup(Employee e) throws SQLException {
		Connection con = DB_Connection.Db_Connection();
		PreparedStatement pstmt = null;
		try {
			pstmt = con.prepareStatement(INSERT_SQL);
			pstmt.setInt(1, e.getE_id());
			pstmt.setString(2, e.getE_name());
			pstmt.setInt(3, e.getD_id());
			pstmt.setInt(4, e.getE_status());
			pstmt.setInt(5, e.getE_sal());
			if (pstmt.executeUpdate() > 0) {
				return true;
			} else {
				return false;
			}
		} catch (SQLException e1) {

			e1.printStackTrace();
			return null;
		}
	}

	@Override
	public Employee selectEmp(Integer id) {
		// TODO Auto-generated method stub
		final String SELECT_USERS = "Select * from employee where e_status=1 and e_id='" + id + "'";

		Employee e = new Employee();
		Connection con = DB_Connection.Db_Connection();
		try {
			PreparedStatement pstmt = con.prepareStatement(SELECT_USERS);
			ResultSet rs = pstmt.executeQuery(SELECT_USERS);
			rs.next();
			e.setE_id(rs.getInt(1));
			e.setE_name(rs.getString("e_name"));
			e.setD_id(rs.getInt("d_id"));
			e.setE_sal(rs.getInt("e_sal"));

			return e;
		} catch (SQLException e1) {
			
			e1.printStackTrace();
			return null;
		}
	}

	public Boolean softDelete(Integer id) {
		
		Connection con = DB_Connection.Db_Connection();
		try {
			PreparedStatement pstmt = con.prepareStatement(SOFT_DELETE);
			pstmt.setInt(1, 0);
			pstmt.setInt(2, id);
			pstmt.setInt(3, 1);
			if (pstmt.executeUpdate() > 0)
				return true;
			else
				return false;
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return false;
		}
	}

	@Override
	public Integer hikeSalary(Integer id) throws SQLException {
		// TODO Auto-generated method stub
		Connection con = DB_Connection.Db_Connection();
		PreparedStatement pstmt;
		EmpDAOimpl empl = new EmpDAOimpl();
		Integer updatedSalary;

		updatedSalary = (int) (empl.SalaryById(id) * (1 + (float) empl.HikeById(id) / 100));
		pstmt = con.prepareStatement(UPDATE_SALARY);
		pstmt.setInt(1, updatedSalary);
		pstmt.setInt(2, id);
		pstmt.executeUpdate();
		return updatedSalary;

	}

	public Integer HikeById(Integer id) {
		Connection con = DB_Connection.Db_Connection();
		PreparedStatement pstmt = null;
		try {
			pstmt = con.prepareStatement(SELECT_HIKE);
			pstmt.setInt(1, id);
			ResultSet rs = pstmt.executeQuery();
			rs.next();
			return rs.getInt("d_hike");
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	public Integer SalaryById(Integer id) throws SQLException {
		Connection con = DB_Connection.Db_Connection();
		PreparedStatement pstmt = con.prepareStatement(SELECT_SALARY);
		pstmt.setInt(1, id);
		ResultSet rs = pstmt.executeQuery();
		rs.next();
		return rs.getInt("e_sal");

	}

	public void hikeSalary() throws SQLException {
		Connection con = DB_Connection.Db_Connection();
		EmpDAOimpl empl = new EmpDAOimpl();
		final String SELECT_Employee = "Select e_id from employee where e_status =1";
		PreparedStatement pstmt = con.prepareStatement(SELECT_Employee);
		ResultSet rs = pstmt.executeQuery(SELECT_Employee);
		while (rs.next()) {
			empl.hikeSalary(rs.getInt("e_id"));
		}
	}

	@Override
	public List<Employee> CL_salaryById(Integer id) throws SQLException {
		
		Connection con = DB_Connection.Db_Connection();
		List<Employee> lists = new ArrayList();
		CallableStatement csmt = con.prepareCall(CS_SELLECT_SALARY);
		csmt.setInt(1, id);
		ResultSet rs = csmt.executeQuery();
		while (rs.next()) {
			Employee e = new Employee();
			e.setE_id(rs.getInt("e_id"));
			e.setE_name(rs.getString("e_name"));
			e.setD_id(rs.getInt("d_id"));
			e.setE_status(rs.getInt("e_status"));
			e.setE_sal(rs.getInt("e_sal"));
			lists.add(e);
		}
		return lists;

	}


}
