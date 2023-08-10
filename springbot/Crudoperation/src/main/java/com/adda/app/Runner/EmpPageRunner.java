package com.adda.app.Runner;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;

import com.adda.app.Bean.Employee;
import com.adda.app.DAO.EmpDao;
//@Component
public class EmpPageRunner implements CommandLineRunner {
    @Autowired
	private EmpDao e;
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
    Pageable p = PageRequest.of(1, 5);
     Page<Employee>page= e.findAll(p);
     page.getContent().forEach(System.out::println);
     
     //meta data
     System.out.println(page.isFirst());
     System.out.println(page.isLast());
     System.out.println(page.isEmpty());
     System.out.println(page.hasNext());
     System.out.println(page.hasPrevious());
     System.out.println(page.getTotalElements());
     System.out.println(page.getSize());
     System.err.println(page.getTotalPages());
	}

}
