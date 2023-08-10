package com.adda.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.adda.app.Bean.Employee;
import com.adda.app.reposatraty.EmpRepos;

@SpringBootApplication
public class SpringSecondProjectUseTheamleaf22Application implements CommandLineRunner {
    @Autowired
	private EmpRepos erepo;
	public static void main(String[] args) {
		SpringApplication.run(SpringSecondProjectUseTheamleaf22Application.class, args);
		
		
	}

	@Override
	public void run(String... args) throws Exception {
		
//		Employee e1 = new Employee( "sheetal",8000.0,"123","cs","indore");
//		Employee e2 = new Employee( "surbhi",7000.0,"123","IT","Bhopal");
//		Employee e3 = new Employee( "ishwari",2000.0,"123","civil","khargone");
//		Employee e4 = new Employee( "minakshi",5000.0,"123","micro","gwaliyar");
//		Employee e5 = new Employee( "kuldeep",4000.0,"123","Botany","nimach");
//		Employee e6 = new Employee( "udit",3000.0,"123","Zoology","jabalpur");
//		erepo.save(e1);
//		erepo.save(e2);
//		erepo.save(e3);
//		erepo.save(e4);
//	erepo.save(e5);
//	erepo.save(e6);
		
	}

}
