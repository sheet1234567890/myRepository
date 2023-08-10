package com.adda.app.Runner;

import org.hibernate.criterion.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Component;

import com.adda.app.DAO.EmpDao;
//@Component
public class EmpFetchRunner implements CommandLineRunner {
    @Autowired
	private EmpDao e;
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
      // 1.bydefault Assending sorting
		e.findAll(Sort.by("eid")).forEach(System.out::println); 
		
		//2.dessending sorting
		/*e.findAll(Sort.by(Direction.ASC,"esal")).forEach(System.out::println);
		e.findAll(Sort.by(Direction.DESC,"esal")).forEach(System.out::println);*/
		
		//3.both assending
		//e.findAll(Sort.by("esal","edep")).forEach(System.out::println);
		
		//4.both desending
		//e.findAll(Sort.by(Direction.DESC, "esal","edep")).forEach(System.out::println);
		
		//e.findAll(Sort.by(Order.asc("esal"),Order.desc("eid"))).forEach(System.out::println);
	}

}
