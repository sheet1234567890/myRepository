package com.adda.app.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.adda.app.Bean.Employee;

public interface EmpService  {
	//create
 public Employee createEmployee(Employee employee);
  
  //update
  public String updateEmployee(Employee employee);
  
  //get
  public List<Employee> getAll();
  
  //delete
  public void deleteEmployee(Integer empId);
}
