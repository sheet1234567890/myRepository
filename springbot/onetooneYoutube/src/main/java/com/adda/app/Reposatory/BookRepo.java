package com.adda.app.Reposatory;

import org.springframework.data.jpa.repository.JpaRepository;

import com.adda.app.Bean.BookoneToone;

public interface BookRepo extends JpaRepository<BookoneToone, Integer> {

}
