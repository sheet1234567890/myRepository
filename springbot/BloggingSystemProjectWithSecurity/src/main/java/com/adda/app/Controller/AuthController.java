package com.adda.app.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.adda.app.Entity.User;
import com.adda.app.Service.IUserService;
import com.adda.app.Util.JwtUtils;
import com.adda.app.payload.UserRequest;
import com.adda.app.payload.UserResponse;

@RequestMapping("/api/auth")
@RestController
public class AuthController {

	@Autowired
	private IUserService uservice;

	/** Authenticationmanager.... */
	@Autowired
	private AuthenticationManager authenticationmanager;

	/** JWTutil ... */
	@Autowired
	private JwtUtils jwtutil;

	/** A.User Ragistration with Security */
	@PostMapping("/signup")
	public ResponseEntity<User> saveUser(@RequestBody User user) {
		
		return new ResponseEntity<User>(uservice.saveUser(user),HttpStatus.CREATED);
	}
	
	/**Login user with Security....*/
	@PostMapping("/signin")
	public ResponseEntity<UserResponse> loginUser(@RequestBody UserRequest userRequest)
	{
		authenticationmanager.authenticate(new UsernamePasswordAuthenticationToken(userRequest.getUsername(), userRequest.getPassword()));
		String token = jwtutil.generateToken(userRequest.getUsername());
		return ResponseEntity.ok(new UserResponse(token, "getenared By Sheetal"));

	}
}
