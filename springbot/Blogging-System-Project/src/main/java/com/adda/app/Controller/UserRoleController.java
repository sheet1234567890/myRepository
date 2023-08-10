package com.adda.app.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.adda.app.Entity.UserRole;
import com.adda.app.Service.IUserRoleService;

@RequestMapping("/api/userRole")
@RestController

public class UserRoleController {
	@Autowired
	private IUserRoleService urService;
	
	@PostMapping("/saveRole")
	public ResponseEntity<UserRole>createUserRole(@RequestBody UserRole uRole)
	{
		return new ResponseEntity<UserRole>(urService.createUserRole(uRole),HttpStatus.CREATED);
	}

}
