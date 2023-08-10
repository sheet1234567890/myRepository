package com.adda.app.Controller;

import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.adda.app.Service.IUserService;
import com.adda.app.entity.User;
import com.adda.app.payload.UserRequest;
import com.adda.app.payload.UserResponse;
import com.adda.app.util.JwtUtils;

@RestController
@RequestMapping("/api/user")
public class UserController {

	/** Private Authentication Manage */
	@Autowired
	private AuthenticationManager authenticationManager;
	/** ...Service... */
	@Autowired
	private IUserService uservice;
	/** JwtUtil.... */
	@Autowired
	private JwtUtils jwtutil;

	/** Save methode */
	@PostMapping("/save")
	public ResponseEntity<String> saveUser(@RequestBody User user) {
		uservice.saveUser(user);
		return ResponseEntity.ok("User Created");

	}

	/** Login User.. */
	@PostMapping("/login")
	public ResponseEntity<UserResponse> loginUser(@RequestBody UserRequest userRequest) {
		
		/** Authentication.... */
         System.out.println(userRequest.getUsername());
		authenticationManager.authenticate(
				new UsernamePasswordAuthenticationToken(userRequest.getUsername(), userRequest.getPassword()));

		/** if Authenticate so generate token */

		String token = jwtutil.generateToken(userRequest.getUsername());
		return ResponseEntity.ok(new UserResponse(token, "getenared By Sheetal"));

	}

	/** After Login... */
	
	@PostMapping("/welcome")
	public ResponseEntity<String> showUserData(Principal p) {
		System.out.println(p.getClass().getName());
		return ResponseEntity.ok("hello :->   " + p.getName());
	}

	@GetMapping("/admin")
	public ResponseEntity<String>showAdminMsg(Principal p)
	{
		return ResponseEntity.ok("hello ADMIN:->"+p);
	}
	@GetMapping("/customer")
	public ResponseEntity<String>showAdmin(Principal p)
	{
		return ResponseEntity.ok("hello Customer:->"+p);
	}

}
