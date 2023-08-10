package com.adda.app.Reposatary;

import org.springframework.data.jpa.repository.JpaRepository;

import com.adda.app.Bean.Employee;

public interface EmpRepo extends JpaRepository<Employee, Integer>{

}
