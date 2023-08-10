package com.adda.app.Runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.adda.app.Bean.BookoneToone;
import com.adda.app.Bean.Studentonetoone;
import com.adda.app.Reposatory.BookRepo;
import com.adda.app.Reposatory.StudentRepo;
@Component
public class TestRunner implements CommandLineRunner {
  @Autowired
	private BookRepo brepo;
  @Autowired
	private StudentRepo srepo;
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
     BookoneToone b1 = new BookoneToone(1,"DB");
     BookoneToone b2 = new BookoneToone(2,"DBMS");
     BookoneToone b3 = new BookoneToone(3,"HB");
     brepo.save(b1);
     brepo.save(b2);
     brepo.save(b3);
      
     Studentonetoone s1 = new Studentonetoone(10,"sheetal",b1);
     Studentonetoone s2 = new Studentonetoone(20,"surbhi",b2);
     Studentonetoone s3 = new Studentonetoone(30,"ishwri",b3);
     srepo.save(s1);
     srepo.save(s2);
     srepo.save(s3);
	}

}
