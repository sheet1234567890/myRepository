package com.adda.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.adda.app.Entity.Product;
import com.adda.app.Exception123.EmployeeNotFoundException;
import com.adda.app.Service.ProductService;

@RequestMapping("/employee")
@RestController
public class EmployeeRestController {
   @Autowired
	private ProductService pservice;
//	@GetMapping("/one/{id}")
//	public ResponseEntity<String> getEmployeById(@PathVariable("id") Integer id)
//	{
//		if(id==150) {
//			return new ResponseEntity<String>("Employee Exist......",HttpStatus.OK);
//		}
//		else
//		 //throw new RuntimeException("Employee not found"  +id);
//			throw new EmployeeNotFoundException("Employee not found"+id);
//	}
	
	
	
	@GetMapping("/one/{id}")
	public ResponseEntity<Product> getEmployeById(@PathVariable("id") Integer id)
	{
		ResponseEntity<Product>response = null;
		try {
			Product pob = pservice.getOneProductById(id);
			response=new ResponseEntity<Product>(pob,HttpStatus.OK);
		}
		catch(EmployeeNotFoundException enfe) 
		{
		  enfe.printStackTrace();
		  throw enfe;
		}
		return response;
	}
}
