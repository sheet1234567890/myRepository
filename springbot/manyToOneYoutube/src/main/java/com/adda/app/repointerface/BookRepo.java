package com.adda.app.repointerface;

import org.springframework.data.jpa.repository.JpaRepository;

import com.adda.app.Bean.Book;

public interface BookRepo extends JpaRepository<Book, Integer> {

}
