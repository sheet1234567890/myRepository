package com.adda.app.Runner;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.adda.app.Bean.Book;
import com.adda.app.DAO.BookReposatary;
@Component
public class TestBookRunner implements CommandLineRunner {

	@Autowired
	private BookReposatary e;
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
         
//          e.saveAll(
//        		  Arrays.asList(
//        				  new Book(1,"maths","sheetal",300.0,"front"),
//        				  new Book(2,"computer","sheetal",3100.0,"front"),
//        				  new Book(3,"physics","sheetal",3230.0,"front"),
//        				  new Book(4,"chemistry","sheetal",3600.0,"front"),
//        				  new Book(5,"maths","sheetal",9300.0,"front"),
//        				  new Book(6,"computer","sheetal",1300.0,"front"),
//        				  new Book(7,"physics","sheetal",8300.0,"front"),
//        				  new Book(8,"chemistry","sheetal",4300.0,"front")
//        				  )
//        		  );
		//1.Select* from book where id = ?
             //e.findByid(1).forEach(System.out::println);
		
		//2.Select*from book where bookid!=?
		//e.findByidNot(1).forEach(System.out::println);
		
		e.findBybookcostLessThenEqual(1300.0).forEach(System.out::println);
	}

}
