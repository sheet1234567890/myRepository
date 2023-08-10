package com.adda.app.Service;

import java.util.List;

import com.adda.app.Entity.Course;

public interface CourseService {


	public Course createCourse(Course course);
	public String deleteCourse(Integer id);
	public String updateCouser(Course address);
	public List<Course>viewAll();
	
}
