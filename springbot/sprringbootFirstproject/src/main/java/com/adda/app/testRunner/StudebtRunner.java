package com.adda.app.testRunner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.adda.app.StudentReposatary.StudentRepo;
import com.adda.app.bean.Student;
@Component
public class StudebtRunner implements CommandLineRunner {
    @Autowired
	private StudentRepo e;
	@Override
	public void run(String... args) throws Exception {
	Student s = new Student();
	s.setSid(1);
	s.setSname("sheetal");
	s.setSaddress("bhopal");
	s.setMobile("7067576774");
	e.save(s);
	
		System.out.println(s);
      
	}

}
