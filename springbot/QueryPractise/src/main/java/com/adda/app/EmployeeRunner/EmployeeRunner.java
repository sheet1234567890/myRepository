package com.adda.app.EmployeeRunner;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.adda.app.Bean.Employee;
import com.adda.app.EmpRepo.EployeeRepo;
@Component
public class EmployeeRunner implements CommandLineRunner {
    @Autowired
	private EployeeRepo e;
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		
		
//		e.saveAll(
//				Arrays.asList(
//						 new Employee(1,"shetal","cs",2000),
//						 new Employee(2,"surbhi","civil",6000),
//						 new Employee(3,"ishwari","it",2060),
//						 new Employee(4,"pinki","civil",25050),
//						 new Employee(5,"shivani","maths",52000),
//						 new Employee(6,"minakshi","network",52000)
//						)
//				);
		
//1.
    // e.getAllEmpNames().forEach(System.out::println);
//2.
   //  e.getAllEmps().forEach(System.out::println);
//3.
    // e.fetchIdAndName().stream().map(obj->obj[0]+":"+obj[1]).forEach(System.out::println);             //object array ko conver krne k liye strean api ka use kiya h
     
//4.     
//	 Optional<String>opt=e.getEmpNameById(1);
//	 if(opt.isPresent()) 
//	 {
//		 System.out.println(opt.get());
//	 }
//	 else 
//	 {
//		 System.out.println("NO Record Found");
//	 }
//5. 
	 Optional<Employee>opt1=e.getEmpById(1);
	 if(opt1.isPresent()) 
	 {
		 System.out.println(opt1.get());
	 }
	 else 
	 {
		 System.out.println("NO Record Found");
	 }
     
		
//6.
	//	Optional<Employee>opt2 = e.getEmployeeByNameAndCost("sheetal", 2000);
		
	}

}
