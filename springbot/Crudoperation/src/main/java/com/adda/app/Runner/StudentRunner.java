package com.adda.app.Runner;

import java.text.SimpleDateFormat;                               
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Component;

import com.adda.app.Bean.Student;
import com.adda.app.DAO.StudentRepo;
//@Component
public class StudentRunner implements CommandLineRunner {
    @Autowired
	private StudentRepo repo;
	@Override
	public void run(String... args) throws Exception {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yy");
		String s = sdf.format(new Date());
		System.out.println("today date:->"+s);
		
		Student std = new Student();
		std.setStdname("surbhi");
		std.setStdFee(4000.0);
		std.setStdDoj(new Date());
		repo.save(std);
		List<Student>l=repo.findAll();
		l.forEach(System.out::println);
		
		//Example object....
		/*Student sob = new Student();
		sob.setStdname("surbhi");
		sob.setStdFee(4000.0);
		Example<Student>stob = Example.of(sob);
		repo.findAll(stob).forEach(System.out::println);*/
		
		
	}

}
