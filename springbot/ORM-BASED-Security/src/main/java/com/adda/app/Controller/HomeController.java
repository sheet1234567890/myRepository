package com.adda.app.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

	@GetMapping("/home")
	public String ShowHome() 
	{
		return "home";
	}
	@GetMapping("/hello")
	public String ShowHello() 
	{
		return "hello";
	}
	
	@GetMapping("/login")
	public String ShowLogin() 
	{
		return "login";
	}
	@GetMapping("/admin")
	public String ShowAdmin() 
	{
		return "admin";
	}
	@GetMapping("/customer")
	public String ShowCustomer() 
	{
		return "customer";
	}
	
	
}
