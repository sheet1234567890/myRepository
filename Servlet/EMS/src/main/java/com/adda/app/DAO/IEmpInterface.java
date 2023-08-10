package com.adda.app.DAO;

import java.util.List;

import com.adda.app.Bean.Employee;

public interface IEmpInterface {
  
	public Boolean save(Employee employee);
	public List<Employee>viewAllEmployee();
	public Boolean deleteEmployeeById(Integer id);
	public Employee updateByIdEmployee(Integer id);
	
}
