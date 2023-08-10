package com.adda.app.Service;

import java.util.List;

import com.adda.app.Entity.Employee;

public interface EmpService {

	public Employee createEmployee(Employee employee);
	public String deleteEmployee(Integer id);
	public String updateEmployee(Employee employee);
	public List<Employee>viewAll();
}
