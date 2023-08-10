package com.adda.app.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.adda.app.Entity.User;
import com.adda.app.MyDuplicateEmailException.DuplicateEmail;
import com.adda.app.Service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
	private UserService uservice;
    @PostMapping("/create")
    public ResponseEntity<User>createUser(@RequestBody User user)
    {
    	ResponseEntity<User>response=null;
    	try 
    	{
    		User user1 = uservice.RagisterUser(user);
    		response = new ResponseEntity<User>(user,HttpStatus.CREATED);
    	}
    catch(DuplicateEmail e) 
    	{
    	  throw e;
    	}
    	return response;
    }
    
    @GetMapping("/login/{email}/{pass}")
    public ResponseEntity<User> LoginUser(@PathVariable("email") String email,@PathVariable("pass") String pass)
    {
    	System.out.println(email+" pass"+pass);
    	
    	return new ResponseEntity<User>(uservice.LoginUser(email, pass),HttpStatus.OK);
    }
    @PostMapping("/abu")
    public ResponseEntity<String>addProductByUser(@RequestBody User user)
    {
    	System.out.println(user);
    	return new ResponseEntity<String>(uservice.addProductByUser(user),HttpStatus.CREATED);
    }
  
}
