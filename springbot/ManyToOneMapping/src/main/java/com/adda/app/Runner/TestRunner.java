package com.adda.app.Runner;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.adda.app.Bean.Department;
import com.adda.app.Bean.Employee;
import com.adda.app.DAO.DepartmentRepo;
import com.adda.app.DAO.Employeerepo;
//@Component
public class TestRunner implements CommandLineRunner {
 @Autowired
	private DepartmentRepo d;
 @Autowired
	private Employeerepo erepo;
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
//		d.saveAll(
//				Arrays.asList(
//						new Department(1,"pshycology","sheetal"),
//						new Department(2,"physics","surbhi"),
//						new Department(3,"chemistry","ishwari"),
//						new Department(4,"network","minakshi"),
//						new Department(5,"computer","aaditi"),
//						new Department(6,"civil","kamini")
//						)
//				);
				
		Department de = new Department();
		de.setDid(2);
		Integer id = de.getDid();
        Employee e = new Employee();
        e.setEid(2);
        e.setEname("aaditi");
        e.setESal(9000.0);
        e.setDep(de);
        erepo.save(e);
        

		
						
						
				

	}

}
