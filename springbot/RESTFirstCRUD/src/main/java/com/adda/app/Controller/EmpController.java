package com.adda.app.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.adda.app.Bean.Employee;
import com.adda.app.Service.EmpService;
@RestController
@RequestMapping("/employee")
public class EmpController {
	
	
	@Autowired
	private EmpService eser;
	
	@PostMapping("/create")
	public ResponseEntity<Employee> createEmployee(@RequestBody Employee employee)
	{
		Employee employee2 = eser.createEmployee(employee);
		return  new ResponseEntity<Employee>(employee2,HttpStatus.CREATED);
	}
	@PutMapping("/update")
	public ResponseEntity<String> updateEmployee(@RequestBody Employee e)
	{
		
		return new ResponseEntity<String>(eser.updateEmployee(e), HttpStatus.OK);
	}
	
	@GetMapping("/fetch")
	public ResponseEntity<List<Employee>> getAll()
	{
		List<Employee>  elist=eser.getAll();
		return new ResponseEntity<List<Employee>>(elist,HttpStatus.OK);
	}
	
	@DeleteMapping("/{empId}")
	public ResponseEntity<String>deleteemployee( @PathVariable ("empId") Integer empId)
	{
		eser.deleteEmployee(empId);
		return new ResponseEntity<String>("successfull delete employee" ,HttpStatus.OK);
	}
	

}
