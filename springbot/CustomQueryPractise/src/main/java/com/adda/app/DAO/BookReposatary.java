package com.adda.app.DAO;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.adda.app.Bean.Book;

public interface BookReposatary extends JpaRepository<Book, Integer> {
	//1.
     List<Book>findByid(Integer id);
     //2.
     List<Book>findByidNot(Integer id);
     //3.
     List<Book>findBybookcostLessThenEqual(Double cost);
      
}
