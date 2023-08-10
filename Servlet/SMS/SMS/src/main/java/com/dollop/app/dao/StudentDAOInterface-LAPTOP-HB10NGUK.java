package com.dollop.app.dao;

import java.sql.SQLException;
import java.util.List;

import com.dollop.app.bean.Student;

public interface StudentDAOInterface {
	public Boolean save(Student student) throws SQLException;
	public List<Student> viewAllStudents();
	public Boolean deleteById(Integer id) throws SQLException;
	public Student studentById(Integer id) throws SQLException;
	public List<Student>getRecords(int start,int total);
	public Integer totalrow();
}
