package com.adda.app.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.adda.app.Entity.GroupVarient;
import com.adda.app.Entity.Product;
import com.adda.app.Service.GroupVarientService;
import com.adda.app.Service.ProductService;

@RestController
@RequestMapping("/product")
public class ProductController {
	
	@Autowired
	private ProductService pservice;
	
	@Autowired
	private GroupVarientService gvService;

	//CreateProduct......
	
	@PostMapping("/save")
	public ResponseEntity<Product> saveProduct(@RequestBody Product product)
	{
		return new ResponseEntity<Product>(pservice.AddProduct(product),HttpStatus.CREATED);
	}
	
	//Show Product List..
	@GetMapping("/listOfProduct")
	public ResponseEntity<List<Product>> listOfProduct()
	{
		return new ResponseEntity<List<Product>>(pservice.listOfProduct(),HttpStatus.OK);
	}
	//show product By id....
	@GetMapping("/productById/{id}")
	public ResponseEntity<Product>ShowproductById(@PathVariable("id") Integer id)
	{
		return new ResponseEntity<Product>(pservice.findProductById(id),HttpStatus.OK);
	}
	
	//update product
	@PutMapping("/updateproduct")
	public ResponseEntity<Product>updateProduct(@RequestBody Product product)
	{
		return new ResponseEntity<Product>(pservice.updateProduct(product),HttpStatus.OK);
	}
	
	
	//update Product by id
	@PostMapping("/updateProductById/{id}")
	public ResponseEntity<Product>updateProductById(@PathVariable("id") Integer id,@RequestBody Product product)
	
	{
		product.setPid(id);
		return new ResponseEntity<Product>(pservice.updateProductById(id, product),HttpStatus.OK);
	}
	
	//Create Group varient....
	@PostMapping("/CreateGroupVarient")
	public ResponseEntity<GroupVarient>saveGroupVarient(@RequestBody GroupVarient gv)
	{
		System.out.println(gv);
		return new ResponseEntity<GroupVarient>(gvService.createvarient(gv),HttpStatus.CREATED);
	}
	
	
	
	
}
