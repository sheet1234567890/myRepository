package com.adda.app.runner;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.adda.app.bean.BookMtoM;
import com.adda.app.bean.StudentMtoM;
import com.adda.app.reposatarory.Bookrepo;
import com.adda.app.reposatarory.StudentRepo;
@Component
public class TestRunner implements CommandLineRunner {
    @Autowired
	private Bookrepo brepo;
    @Autowired
	private StudentRepo srepo;
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
       BookMtoM b1 = new BookMtoM(1,"DB");
       BookMtoM b2 = new BookMtoM(2,"DBMS");
       BookMtoM b3 = new BookMtoM(3,"HB");
       brepo.save(b1);
       brepo.save(b2);
       Set<BookMtoM>l1 = Set.of(b1,b3);
       Set<BookMtoM>l2 = Set.of(b2,b3);
       
       
       StudentMtoM stu1 = new StudentMtoM(10,"sheetal",l1);
       StudentMtoM stu2 = new StudentMtoM(20,"surbhi",l2);
       srepo.save(stu1);
       srepo.save(stu2);
	}

}
