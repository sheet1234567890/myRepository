package com.adda.app.Runner;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

import com.adda.app.Bean.Employee;
import com.adda.app.DAO.EmpDao;
//@Component
public class EmpSaveRunner implements CommandLineRunner {
    @Autowired
	private EmpDao e;
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
//	  e.saveAll(
//			  Arrays.asList(
//					  new Employee(17,"sheetal",150,"ABC"),
//					  new Employee(18,"surbhi",100,"ABC"),
//					  new Employee(19,"ishwari",350,"ABC"),
//					  new Employee(20,"minakshi",300,"ABC"),
//					  new Employee(21,"shivani",250,"ABC"),
//					  new Employee(22,"rupali",200,"ABC")
//					  )
//			  );
		
   
	}

}
