package com.adda.app.Runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.adda.app.Bean.Book;
import com.adda.app.Bean.Student;
import com.adda.app.repointerface.BookRepo;
import com.adda.app.repointerface.sturepo;
@Component
public class TestRunner implements CommandLineRunner {

	@Autowired
	private BookRepo brepo;
	@Autowired
	private sturepo srepo;
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Book b1 = new Book(101,"DS");
		Book b2= new Book(1010,"DBMS");
		brepo.save(b1);
		brepo.save(b2);
		
		Student s1 = new Student(10,"sam",b2);
		Student s2 = new Student(20,"Ram",b2);
		Student s3 = new Student(30,"pam",b2);
		Student s4 = new Student(40,"dam",b2);
		srepo.save(s1);
		srepo.save(s2);
		srepo.save(s3);
		srepo.save(s4);
	}
	
}