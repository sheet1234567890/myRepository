package com.adda.app.DAO;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.adda.app.Bean.Employee;

public interface EmpDao extends PagingAndSortingRepository<Employee, Integer> {

	@Query("SELECT e from Employee e where where e.ename=:name")
	List<Employee>getEmployeeByName(String name);
}
