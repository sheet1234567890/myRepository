package com.adda.app.DAO;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.adda.app.Bean.Book;

public interface BookRepo extends JpaRepository<Book, Integer> {

	
	//SQL =Select*from book where author=?
    List<Book>findByBookauthor(String author);
	List<Book>findByBookauthorEquals(String author);
	List<Book>findByBooktype(String booktype);
	List<Book>findByBookCostLessThanEqual(Double cost);
	List<Book>findByBookidNot(Integer id);
	List<Book>findByBookCostGreaterThanEqual(Double cost);
	List<Book> findByBookauthorIsNull();
	List<Book>findByBookauthorIsNotNull();
	List<Book>findByBookauthorLike( String bookauthor );
	List<Book>findByBookauthorStartingWith(String bookauthor);
	List<Book>findByBookauthorEndingWith(String bookauthor);
	List<Book>findByBookauthorContaining(String input);
	List<Book>findByBookidBetween(Integer i1,Integer i2);
	//List<Book>findByBookidLessThenEqualOrBooktypeLike(Integer id,String input);
	Optional<Book>findByBookidIs(Integer id);
}
