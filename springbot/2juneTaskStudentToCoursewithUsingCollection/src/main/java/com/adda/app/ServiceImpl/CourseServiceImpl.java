package com.adda.app.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.adda.app.Entity.Course;
import com.adda.app.Reposatary.CourseRepo;
import com.adda.app.Service.CourseService;
@Service
public class CourseServiceImpl implements CourseService {
    @Autowired
	private CourseRepo crepo;
	@Override
	public Course createCourse(Course course) {
		
		return crepo.save(course);
	}

	@Override
	public String deleteCourse(Integer id) {
		
		if(crepo.existsById(id)) 
		{
			crepo.deleteById(id);
			return "Successfull delete";
		}
		return "Course not found";
	}

	@Override
	public String updateCouser(Course address) {
		if(crepo.existsById(address.getCid())) 
		{
			crepo.save(address);
			return "Successfull delete";
		}
		return "Course not found";
	
	}

	@Override
	public List<Course> viewAll() {
		return crepo.findAll();
	}

}
