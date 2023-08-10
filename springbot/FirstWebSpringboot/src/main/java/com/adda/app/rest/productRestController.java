package com.adda.app.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/product")
public class productRestController {

	@GetMapping("/fetch")
	public ResponseEntity<String> productget() 
	{
		ResponseEntity<String>response=new ResponseEntity<String>("from get product",HttpStatus.OK);
		return response;
		
	}
	
	@PutMapping("/update")
	public ResponseEntity<String> productupdate()
	{
		ResponseEntity<String>response=new ResponseEntity<String>("Success full update",HttpStatus.OK);
		return response;
	}
	
	@DeleteMapping("/delete")
	public ResponseEntity<String> productremove()
	{
		ResponseEntity<String>response=new ResponseEntity<String>("Success full delete",HttpStatus.OK);
		return response;
	}
	@PostMapping("/save")
	public ResponseEntity<String> productshow()
	{
		ResponseEntity<String>response=new ResponseEntity<String>("Success full create",HttpStatus.CREATED);
		return response;
	}
	@PatchMapping("/save")
	public ResponseEntity<String> productshowupdate()
	{
		ResponseEntity<String>response=new ResponseEntity<String>("Success full patch",HttpStatus.CREATED);
		return response;
	}
	
}
