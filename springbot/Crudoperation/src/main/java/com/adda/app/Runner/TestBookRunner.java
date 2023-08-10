package com.adda.app.Runner;

import java.util.Arrays;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.adda.app.Bean.Book;
import com.adda.app.DAO.BookRepo;
@Component
public class TestBookRunner implements CommandLineRunner {
    @Autowired
	private BookRepo repo;
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
//	repo.saveAll(
//			Arrays.asList(
//						new Book(109,"SBMS","sheetal",300.0,"Backend"),
//					    new Book(102,"physics","surbhi",400.0,"FRONT"),		
//					    new Book(103,"chemistry","ishwari",200.0,"Backend"),					
//					    new Book(104,"ARCHItecture","minakshi",100.0," Database"),
//						new Book(105,"Network","shivi",600.0,"front"),
//						new Book(106,"DBMS","rupali",800.0,"DAtaBase"),
//						new Book(107,"python","aaditi",50.0,"Backend"),
//						new Book(108,"java","kamini",4000.0,"Backend")
//					
//				)
//			);
	//repo.findByBookauthor("sheetal").forEach(System.out::println);
	//repo.findByBookauthorEquals("sheetal").forEach(System.out::println);
	//repo.findByBooktype("FRONT").forEach(System.out::println);
	//repo.findByBookCostLessThanEqual(200.0).forEach(System.out::println);
	//repo.findByBookidNot(106).forEach(System.out::println);
	//repo.findByBookCostGreaterThanEqual(800.0).forEach(System.out::println);
	//repo.findByBookauthorIsNull().forEach(System.out::println);
	//repo.findByBookauthorIsNotNull().forEach(System.out::println);
	// repo.findByBookauthorLike("s%").forEach(System.out::println);
//	repo.findByBookauthorStartingWith("s").forEach(System.out::println);
		//repo.findByBookauthorLike("i%").forEach(System.out::println);
	//	repo.findByBookauthorEndingWith("l").forEach(System.out::println);
		//repo.findByBookauthorContaining("z").forEach(System.out::println);
		//repo.findByBookidBetween(102, 105).forEach(System.out::println);
		//repo.findByBookidLessThenEqualOrBooktypeLike(102, "front");
		Optional<Book>op=repo.findByBookidIs(10299);
		if(op.isPresent()) 
		{
			System.out.println(op.get());
		}
		else 
		{
			System.out.println("not found data");
		}
		
	
	}

	
}
