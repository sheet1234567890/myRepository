package com.adda.app.Service;

import java.util.List;

import com.adda.app.Entity.Student;

public interface StudentService {

	public Student createStudent(Student student);
	public String deleteStudent(Integer id);
	public String updateStudent(Student student);
	public List<Student>viewAll();
}
