package com.adda.app.reposatarory;

import org.springframework.data.jpa.repository.JpaRepository;

import com.adda.app.bean.BookMtoM;

public interface Bookrepo extends JpaRepository<BookMtoM, Integer> {

}
