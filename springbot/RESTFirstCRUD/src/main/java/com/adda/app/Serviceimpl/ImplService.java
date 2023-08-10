package com.adda.app.Serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.adda.app.Bean.Employee;
import com.adda.app.Reposatary.EmpRepo;
import com.adda.app.Service.EmpService;
@Service
public class ImplService implements EmpService {
	@Autowired
	private EmpRepo erepo;

	@Override
	public Employee createEmployee(Employee employee) {
		Employee e2=erepo.save(employee);
		return e2;
	}

	@Override
	public String updateEmployee(Employee employee) {
		
			erepo.save(employee);
			return "Successfull update";
		
		
		
		  
		
		
	}

	@Override
	public List<Employee> getAll() {
	List<Employee>elist= erepo.findAll();
		return elist;
	}

	@Override
	public void deleteEmployee(Integer empId) {
		erepo.deleteById(empId);
	}

}
