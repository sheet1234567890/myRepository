package com.adda.app.Repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.adda.app.Bean.Author;

public interface Authorrepo extends JpaRepository<Author, Integer> {

	@Query("select b.bname ,a.aname from Book b inner join Author a")
	List getbookauthor();
}
