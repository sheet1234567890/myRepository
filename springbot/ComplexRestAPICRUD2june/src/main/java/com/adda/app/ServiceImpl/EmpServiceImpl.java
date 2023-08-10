package com.adda.app.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.adda.app.Entity.Employee;
import com.adda.app.Reposatary.EmpRepo;
import com.adda.app.Service.EmpService;
@Service
public class EmpServiceImpl implements EmpService {

	@Autowired
	private EmpRepo erepo;
	@Override
	public Employee createEmployee(Employee employee) {
		
		return this.erepo.save(employee);
	}

	@Override
	public String deleteEmployee(Integer id) {
		
		if(erepo.existsById(id)) 
		{
			erepo.deleteById(id);
			return "SuccessFull delete employee";
		}
		return "Employee Not Found";
	}

	@Override
	public String updateEmployee(Employee employee) {
		if(erepo.existsById(employee.getEid())) 
		{
		erepo.save(employee);
		return "Successfull Update";
		}
		return "Employee Not Found";
	}

	@Override
	public List<Employee> viewAll() {
		
		return erepo.findAll();
	}

}
