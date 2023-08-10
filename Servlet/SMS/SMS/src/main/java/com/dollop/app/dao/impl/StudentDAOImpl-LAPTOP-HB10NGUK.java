package com.dollop.app.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.dollop.app.bean.Student;
import com.dollop.app.dao.StudentDAOInterface;
import com.dollop.app.util.DbConnection;

public class StudentDAOImpl implements StudentDAOInterface {
	private static final String INSERT_STUDENT = "INSERT INTO student(sname,semail,smobail,saddress) VALUES(?,?,?,?)";
	private static final String VIEW_STUDENT = "SELECT * FROM student";
	private static final String UPDATE_STUDENT = "UPDATE student set sname=?,semail=?,smobail=?,saddress=? where sid=?";
	private static final String DELETE_STUDENT = "DELETE from student where sid=?";
	private static final String STUDENT_SQL = "select*from student where sid=?";
	private static final String TOTAL_ROW="Select count(sid)from student";

	private Connection con = null;
	private PreparedStatement pstmt = null;

	public Boolean save(Student student) throws SQLException {
		con = DbConnection.getConnection();
		if (student.getSid() == null) {
			pstmt = con.prepareStatement(INSERT_STUDENT);
		} else {
			pstmt = con.prepareStatement(UPDATE_STUDENT);
			pstmt.setInt(5, student.getSid());
			System.out.println("update");
		}
		pstmt.setString(1, student.getSname());
		pstmt.setString(2, student.getSemail());
		pstmt.setString(3, student.getSmobile());
		pstmt.setString(4, student.getSaddress());
		System.out.println(INSERT_STUDENT);
		if (pstmt.executeUpdate() > 0) {
			return true;
		} else {
			return false;
		}
	}

	public List<Student> viewAllStudents() {
		con = DbConnection.getConnection();
		List<Student> studentsList = new ArrayList<Student>();
		try {
			pstmt = con.prepareStatement(VIEW_STUDENT);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				Student student = new Student();
				student.setSid(rs.getInt("sid"));
				student.setSname(rs.getString("sname"));
				student.setSemail(rs.getString("semail"));
				student.setSmobile(rs.getString("smobail"));
				student.setSaddress(rs.getString("saddress"));
				studentsList.add(student);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return studentsList;
	}

	@Override
	public Boolean deleteById(Integer id) throws SQLException {
		con = DbConnection.getConnection();
		List<Student> StudentList = new ArrayList();
		pstmt = con.prepareStatement(DELETE_STUDENT);
		pstmt.setInt(1, id);
		if (pstmt.executeUpdate() > 0) {
			System.out.print("Delete recorted");
			return true;
		} else {
			System.out.println("Not Delete Recorted");
			return false;
		}
	}

	@Override
	public Student studentById(Integer id) throws SQLException {
		con = DbConnection.getConnection();
		Student student = new Student();
		pstmt = con.prepareStatement(STUDENT_SQL);
		pstmt.setInt(1, id);
		ResultSet rs = pstmt.executeQuery();
		rs.next();
		student.setSid(rs.getInt("sid"));
		student.setSname(rs.getString(2));
		student.setSemail(rs.getString(3));
		student.setSmobile(rs.getString(4));
		student.setSaddress(rs.getString(5));

		return student;
	}

	@Override
	public List<Student> getRecords(int start, int total) {
		List<Student> list = new ArrayList();
		con = DbConnection.getConnection();
		try {
			pstmt = con.prepareStatement("select * from student limit " + (start - 1) + "," + total);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				Student student = new Student();
				student.setSid(rs.getInt("sid"));
				student.setSname(rs.getString("sname"));
				student.setSemail(rs.getString("semail"));
				student.setSmobile(rs.getString("smobail"));
				student.setSaddress(rs.getString("saddress"));
				list.add(student);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return list;
	}

	@Override
	public Integer totalrow() {
		con = DbConnection.getConnection();
		int count=0;
		try {
		pstmt = con.prepareStatement(TOTAL_ROW);
		ResultSet rs = pstmt.executeQuery();
		while(rs.next()) 
		{
		count = rs.getInt(1);
		}
		}
		catch(Exception e) 
		{
			e.printStackTrace();
		}
		return count;
	}

}
