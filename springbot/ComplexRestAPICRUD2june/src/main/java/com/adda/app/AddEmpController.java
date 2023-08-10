package com.adda.app;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.adda.app.Entity.Address;
import com.adda.app.Entity.Employee;
import com.adda.app.Service.AddService;
import com.adda.app.Service.EmpService;

@RestController
@RequestMapping("/emp")
public class AddEmpController {
    @Autowired
	private AddService addService;
    @Autowired
    private EmpService empService;
    
    @PostMapping("/EmpSave")
	public ResponseEntity<Employee>saveEmployee(@RequestBody Employee employee)
	{
		return new  ResponseEntity<Employee>(empService.createEmployee(employee),HttpStatus.CREATED);
	}
    
    @DeleteMapping("/{eid}")
    public ResponseEntity<String>deleteEmployee(@PathVariable("eid") Integer id)
    {
    	
    return new ResponseEntity<String>(empService.deleteEmployee(id),HttpStatus.OK);
    }
    
    @PutMapping("/Empedit")
    public ResponseEntity<String> updateEmp(@RequestBody Employee employee)
    {
    	return new ResponseEntity<String>(empService.updateEmployee(employee),HttpStatus.OK);
    }
    
    @PutMapping("/Addedit")
    public ResponseEntity<String> updateAdd(@RequestBody Address address)
    {
    	return new ResponseEntity<String>(addService.updateAddress(address),HttpStatus.OK);
    }
    
    @GetMapping("/fetch")
    public ResponseEntity<List> getEmpandAdd()
    {
    	return new ResponseEntity<List>(empService.viewAll(),HttpStatus.OK);
    }
    
    
//    @DeleteMapping("/{aid}")
//    public ResponseEntity<String>deleteAddress(@PathVariable ("aid") Integer aid)
//    {
//    	return new ResponseEntity<String>(addService.deleteAddress(aid),HttpStatus.OK);
//    }
}
