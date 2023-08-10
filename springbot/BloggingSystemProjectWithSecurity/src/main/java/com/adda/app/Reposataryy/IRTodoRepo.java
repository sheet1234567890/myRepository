package com.adda.app.Reposataryy;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.adda.app.Entity.Todos;

public interface IRTodoRepo extends JpaRepository<Todos, Integer> {

	  
	   @Modifying
	   @Transactional
	    @Query("UPDATE Todos t SET t.completed = :b WHERE t.todoid = :id")
	public Integer updateTodoisCompletorNotComplit(Boolean b,Integer id) ;
}
