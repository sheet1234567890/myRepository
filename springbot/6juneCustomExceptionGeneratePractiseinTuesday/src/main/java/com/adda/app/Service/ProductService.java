package com.adda.app.Service;

import org.springframework.stereotype.Service;

import com.adda.app.Bean.Product;
import com.adda.app.CustomExceptionClass.MyCostomException;

@Service
public class ProductService {

	public Product getOneProduct(Integer id) 
	{
		if(id==150)
			return new Product(id, "ABC");
		else
			throw new MyCostomException("Product not found");
	}
	
}
