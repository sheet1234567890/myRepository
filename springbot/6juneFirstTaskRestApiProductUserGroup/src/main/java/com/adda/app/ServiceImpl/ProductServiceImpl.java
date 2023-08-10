package com.adda.app.ServiceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.adda.app.Entity.Product;
import com.adda.app.MyDuplicateEmailException.ProductNotFound;
import com.adda.app.Reposataryy.ProductRepo;
import com.adda.app.Service.ProductService;
@Service
public class ProductServiceImpl implements ProductService {
  @Autowired
	private ProductRepo prepo;
  
 

@Override
public Product AddProduct(Product product) {
	
	 return prepo.save(product);
}



@Override
public List<Product> listOfProduct() {
	
	return prepo.findAll();
}



@Override
public Product findProductById(Integer id) {
	Optional<Product> p = prepo.findById(id);
	
	if(p.isPresent()) {
	return p.get();
	}
	else 
	{
		throw new ProductNotFound("product nhi mil rha heee.......");
	}
	
}



@Override
public Product updateProduct(Product product) {
	
	Integer id =product.getPid();
	if(id!=null) 
	{    
		return prepo.save(product);
	}
	else 
	
	{
		throw new ProductNotFound("product nhi mil rha heee.......");
	}
}



@Override
public Product updateProductById(Integer id, Product product) {
	
	if(prepo.existsById(id)) 
	{
		return prepo.save(product);
	}
	else 
	{
		throw new ProductNotFound("product nhi mil rha heee.......");
	}
}
}

