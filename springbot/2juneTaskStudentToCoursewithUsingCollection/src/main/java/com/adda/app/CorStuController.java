package com.adda.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.adda.app.Entity.Student;
import com.adda.app.Service.CourseService;
import com.adda.app.Service.StudentService;

@RequestMapping("/student")
@RestController
public class CorStuController {

	@Autowired
	private CourseService cservice;
	@Autowired
	private StudentService sservice;
	
	@PostMapping("/saveStudent")
	public ResponseEntity<Student> saveStudent(@RequestBody Student student)
	{
		return new ResponseEntity<Student>(sservice.createStudent(student),HttpStatus.CREATED);
	}
	@DeleteMapping("/{id}")
	public ResponseEntity<String> deleteStudent(@PathVariable("id") Integer id)
	{
		return new ResponseEntity<String>(sservice.deleteStudent(id),HttpStatus.OK);	
	}
	
	@PutMapping("/edit")
	public ResponseEntity<String> editStudent(@RequestBody Student student)
	{
		return new ResponseEntity<String>(sservice.updateStudent(student),HttpStatus.OK);	
	}
	
	@DeleteMapping("/delete/{eid}")
	public ResponseEntity<String> deleteCourse(@PathVariable("eid") Integer id)
	{
		return new ResponseEntity<String>(cservice.deleteCourse(id),HttpStatus.OK);	
	}
}
