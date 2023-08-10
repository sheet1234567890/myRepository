package com.adda.app.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.adda.app.Bean.Role;
import com.adda.app.Bean.User;
import com.adda.app.Service.RoleService;
import com.adda.app.Service.UserService;

@RequestMapping("/user")
@RestController
public class UserRoleController {
	
	@Autowired
	private UserService uservice;
	@Autowired
	private RoleService rservice;
	
	@PostMapping("/save")
	public ResponseEntity<User> saveUser(@RequestBody User user)
	{
		return new ResponseEntity<User>(uservice.saveUser(user),HttpStatus.CREATED);
	}

	
//	@PostMapping("/rc")
//	public ResponseEntity<Role> creteRole(@RequestBody Role role)
//	{
//		Role role2=this.rservice.createrole(role);
//		return new ResponseEntity<Role>(role2,HttpStatus.CREATED);
//	}
	
	@PutMapping("/ru")
	public ResponseEntity<String> updateRole(@RequestBody Role role)
	{
		return new ResponseEntity<String>(rservice.updateRole(role),HttpStatus.OK);
	}
	@DeleteMapping("/{id}")
	public ResponseEntity<String> deleteRole(@PathVariable("id") Integer id)
	{
		
		return  new ResponseEntity<String>(this.rservice.deleteRole(id),HttpStatus.OK);
	}

	
	@GetMapping("/r")
	public ResponseEntity<List<Role>> getAllRoll()
	{
		List<Role> rolelist=this.rservice.viewAll();
		return new ResponseEntity<List<Role>>(rolelist,HttpStatus.OK);
	}
	
	@PostMapping("/uc")
	public ResponseEntity<User> creteUser(@RequestBody User user)
	{
		User user2=this.uservice.createUser(user);
		return new ResponseEntity<User>(user2,HttpStatus.CREATED);
	}
	
	@DeleteMapping("deleteuser/{eid}")
	public ResponseEntity<String> deleteUser(@PathVariable("eid") Integer id)
	{
		
		return  new ResponseEntity<String>(this.uservice.deleteUser(id),HttpStatus.OK);
	}
	@PutMapping("/updateuser")
	public ResponseEntity<String> updateUser(@RequestBody User user)
	{
		return new ResponseEntity<String>(uservice.updateUser(user),HttpStatus.OK);
	}
	
	@GetMapping("/fetchUser")
	public ResponseEntity<List<User>>getalluser()
	{
		return new ResponseEntity<List<User>>(this.uservice.viewAll(),HttpStatus.OK);
	}
    @DeleteMapping("/deluser")
	public ResponseEntity<String> deleteall()
	{
		return new ResponseEntity<String>(this.uservice.deleteAll(),HttpStatus.OK);
	}
    
    

}
