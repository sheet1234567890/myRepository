package com.adda.app.Serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.adda.app.Bean.Employee;
import com.adda.app.Service.EmpService;
import com.adda.app.reposatraty.EmpRepos;
@Service
public class ImplService implements EmpService {
   @Autowired
	private EmpRepos erepo;
	
	public List<Employee> getAllEmployee() {
		
		
		return erepo.findAll();
	}

	@Override
	public void deleteEmployee(Integer id) {
		this.erepo.deleteById(id);
		
	}

	@Override
	public void SaveEmployee(Employee employee) {
		
		this.erepo.save(employee);
	}

	
	
	
	@Override
	public Employee editEmployee(Integer id) {
	Optional<Employee>optional= this.erepo.findById(id);
	Employee employee=null;
	if(optional.isPresent()) 
	{
		employee=optional.get();
	}
	else 
	{
		throw new RuntimeException("Employee not Found id :: "+id);
	}
		return employee;
	}

	@Override
	public Page<Employee> findpaginated(int pageno, int pagesize, String sortfield, String sortDirection) {
		Sort sort = sortDirection.equalsIgnoreCase(Sort.Direction.ASC.name())? Sort.by(sortfield).ascending():Sort.by(sortfield).descending();
		
		
		//paginatation...+Sorting
		Pageable pageable = PageRequest.of(pageno-1, pagesize,sort);
		return this.erepo.findAll(pageable);
	}
	
	public List<Employee> listAll(String keyword)
	{
		System.out.println(keyword);
		return erepo.Search(keyword);
	}

	

}
