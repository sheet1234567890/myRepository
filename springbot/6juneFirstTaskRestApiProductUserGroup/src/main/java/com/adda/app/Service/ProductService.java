package com.adda.app.Service;

import java.util.List;

import com.adda.app.Entity.Product;

public interface ProductService {

	public Product AddProduct(Product product); 
	public List<Product> listOfProduct();
	public Product findProductById(Integer id);
	public Product updateProduct(Product product);
	public Product updateProductById(Integer id,Product product);
}
