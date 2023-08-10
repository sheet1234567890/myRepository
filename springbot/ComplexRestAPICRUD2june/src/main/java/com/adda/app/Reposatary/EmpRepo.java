package com.adda.app.Reposatary;

import org.springframework.data.jpa.repository.JpaRepository;

import com.adda.app.Entity.Employee;

public interface EmpRepo extends JpaRepository<Employee, Integer> {

}
