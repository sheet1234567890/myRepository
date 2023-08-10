package com.adda.app.StudentReposatary;

import org.springframework.data.repository.CrudRepository;

import com.adda.app.bean.Student;

public interface StudentRepo extends CrudRepository<Student, Integer> {

}
