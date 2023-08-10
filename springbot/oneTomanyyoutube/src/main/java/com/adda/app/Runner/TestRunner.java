package com.adda.app.Runner;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.adda.app.bean.Bookonetomany;
import com.adda.app.bean.Studentonetomany;
import com.adda.app.repointerface.Bookrepo;
import com.adda.app.repointerface.studentrepo;
@Component
public class TestRunner implements CommandLineRunner {
    @Autowired
	private Bookrepo brepo;
    @Autowired
	private studentrepo srepo;
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub

		Bookonetomany b1 = new Bookonetomany(1,"java");
		Bookonetomany b2 = new Bookonetomany(2,"java1");
		Bookonetomany b3 = new Bookonetomany(3,"java2");
		brepo.save(b1);
		brepo.save(b2);
		brepo.save(b3);
		Set <Bookonetomany>s1 = Set.of(b1,b2,b3);
		Studentonetomany std1 = new Studentonetomany(10,"sheetal",s1);
		Studentonetomany std2 = new Studentonetomany(20,"surbhi",s1);
		srepo.save(std1);
		srepo.save(std2);
		
	}

}
