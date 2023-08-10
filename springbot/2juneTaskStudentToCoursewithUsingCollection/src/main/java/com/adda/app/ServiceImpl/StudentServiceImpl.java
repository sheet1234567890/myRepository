package com.adda.app.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.adda.app.Entity.Student;
import com.adda.app.Reposatary.StudentRepo;
import com.adda.app.Service.StudentService;
@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentRepo srepo;
	@Override
	public Student createStudent(Student student) {
		return srepo.save(student);
		
	}

	@Override
	public String deleteStudent(Integer id) {
	    Student student = srepo.findById(id).get();
	           srepo.delete(student);
		return "Successfull delete";
	
	}

	@Override
	public String updateStudent(Student student) {
		if(srepo.existsById(student.getSid())) 
		{
			srepo.save(student);
			return "Successfull update";
		}
		return "Student not found";
		
	}

	@Override
	public List<Student> viewAll() {
		
		return srepo.findAll();
	}

}
