package com.adda.app.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.adda.app.Bean.Student;

public interface StudentRepo extends JpaRepository<Student, Integer> {

}
