package com.adda.app.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.adda.app.Bean.Book;

public interface Bookrepo extends JpaRepository<Book, Integer> {

}
