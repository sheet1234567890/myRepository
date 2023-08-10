package com.adda.app.Service;

import java.util.List;

import org.springframework.data.domain.Page;

import com.adda.app.Bean.Employee;

public interface EmpService {

	List<Employee>getAllEmployee();
    public void deleteEmployee(Integer id);
	public void SaveEmployee(Employee employee);
	public Employee editEmployee(Integer id);
	public Page<Employee> findpaginated(int pageno,int pagesize,String sortfield,String sortDirection);
	public List<Employee> listAll(String keyword);
}
