package com.adda.app.Runner;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.adda.app.Bean.Author;
import com.adda.app.Bean.Book;
import com.adda.app.Repo.Authorrepo;
import com.adda.app.Repo.Bookrepo;
@Component
public class TestRunner implements CommandLineRunner {
	@Autowired
     private Authorrepo arepo;
	@Autowired
     private Bookrepo brepo;
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
         Book b = new Book(1,"java",200.0);
         Book b1 = new Book(2,"python",300.0);
         brepo.save(b);
         brepo.save(b1);
         List<Book> l = new ArrayList<Book>();
         l.add(b);
         l.add(b1);
         
         Author a = new Author(1,"jems gosling",l);
         arepo.save(a);
         arepo.getbookauthor().forEach(System.out::println);
	}

}
