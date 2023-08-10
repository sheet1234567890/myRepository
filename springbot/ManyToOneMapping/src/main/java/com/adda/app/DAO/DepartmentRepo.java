package com.adda.app.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.adda.app.Bean.Department;

public interface DepartmentRepo extends JpaRepository<Department, Integer> {

}
