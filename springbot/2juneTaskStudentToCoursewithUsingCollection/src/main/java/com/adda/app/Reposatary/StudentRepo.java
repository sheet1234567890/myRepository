package com.adda.app.Reposatary;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.adda.app.Entity.Student;

public interface StudentRepo extends JpaRepository<Student, Integer> {
//     
//	@Query("delete from Student s where s.sid=:id")
//	@Transactional
//	
//	@Modifying
//	public void deleteEmployeeId(Integer id); 
}
