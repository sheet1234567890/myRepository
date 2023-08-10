package com.adda.app.MyExceptionController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.adda.app.Bean.Product;
import com.adda.app.CustomExceptionClass.MyCostomException;
import com.adda.app.Service.ProductService;

@RestController
@RequestMapping("/ex")
public class ExceptionController {
    @Autowired
	private ProductService pservice;
	@GetMapping("/one/{id}")
	public ResponseEntity<Product> getproduct(@PathVariable("id") Integer id)
	{
		ResponseEntity<Product>response=null;
		try 
		{
			Product pob = pservice.getOneProduct(id);
			response = new ResponseEntity<Product>(pob,HttpStatus.OK);
		}
		catch(MyCostomException e) 
		{
			throw e;
		}
		return response;
	}
}
