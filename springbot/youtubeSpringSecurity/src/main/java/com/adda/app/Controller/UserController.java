package com.adda.app.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.adda.app.Model.User;
import com.adda.app.Service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
	private UserService uservice;
	@GetMapping("/")
	public List<User>getAllUser()
	{
		return uservice.viewUser();
	}
	@GetMapping("/{username}")
	public User getUser(@PathVariable("username") String uname) 
	{
		return uservice.ViewUserById(uname);
	}
	@PostMapping("/user1")
	public User add(@RequestBody User user) 
	{
		return this.uservice.CreateUser(user);
	}
}
