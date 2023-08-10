package com.adda.app.Service;

import org.springframework.stereotype.Service;

import com.adda.app.Entity.Product;
import com.adda.app.Exception123.EmployeeNotFoundException;

@Service
public class ProductService {

	public Product getOneProductById(Integer id) 
	{
		if(id==150) 
		{
			return new Product(id,"ABC");
		}
		else 
			throw new EmployeeNotFoundException("Sorry Sheetal your Product not found " +id);
		
	}
}
