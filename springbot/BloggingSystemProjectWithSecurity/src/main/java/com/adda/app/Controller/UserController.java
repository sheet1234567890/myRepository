package com.adda.app.Controller;

import java.security.Principal;

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

import com.adda.app.Entity.Album;
import com.adda.app.Entity.Comments;
import com.adda.app.Entity.Post;
import com.adda.app.Entity.Todos;
import com.adda.app.Entity.User;
import com.adda.app.Exceptions.UserNotFoundException;
import com.adda.app.Service.IUserService;
import com.adda.app.payload.RequestCheakEmail;
import com.adda.app.payload.RequestCheakName;

@RestController
@RequestMapping("/api/user")
public class UserController {
	@Autowired
	private IUserService uservice;

	/** 1.Get logged in user profile */
	@GetMapping("/me")
	public ResponseEntity<String> showAdminMsg(Principal p) {
		return ResponseEntity.ok("hello :-> " + p.getName());
	}

	/** 2. Get User Profile by User name */
	@GetMapping("/{username}/profile")
	public ResponseEntity<User> Userprofile(@PathVariable("username") String name) {

		try {
			return new ResponseEntity<User>(uservice.profile(name), HttpStatus.OK);
		} catch (UserNotFoundException e) {
			throw e;
		}
	}

	/** 3 .Get Post By User Name */
	@GetMapping("/{username}/posts")
	public ResponseEntity<Post> getPostByUserName(@PathVariable("username") String name) {
		try {
			return new ResponseEntity<Post>(uservice.getPostByUserName(name), HttpStatus.OK);
		} catch (UserNotFoundException e) {
			throw e;
		}
	}

	/** .CheakName Name Exists or not Exists */
	@PostMapping("/checkUsernameAvailability")
	public ResponseEntity<String> cheakUserName(@RequestBody RequestCheakName R) {

		return new ResponseEntity<String>(uservice.CheakUserName(R.getCheakName()), HttpStatus.OK);
	}

	/** 4.cheakEmail Email Exists or not Exists */
	@GetMapping("/checkEmailAvailability")
	public ResponseEntity<String> cheakUserEmail(@RequestBody RequestCheakEmail R) {
		System.out.println(R.getCheakEmail());
		return new ResponseEntity<String>(uservice.CheakUserEmail(R.getCheakEmail()), HttpStatus.OK);
	}

	/** 5. Get Album By User Name */
	@GetMapping("/{username}/albums")
	public ResponseEntity<Album> getAlbumByUserName(@PathVariable("username") String name) {
		try {
			return new ResponseEntity<Album>(uservice.getAlbumByUserName(name), HttpStatus.OK);
		} catch (UserNotFoundException e) {
			throw e;
		}
	}

	/**Add User By Admin*/
	@PostMapping("/")
	public ResponseEntity<User> CreateuserByAdmin(@RequestBody User user) {
		return new ResponseEntity<User>(uservice.saveUser(user), HttpStatus.OK);
	}
	
	
	/** .Update User By UserName....login user or Admin */
	@PutMapping("/{username}")
	public ResponseEntity<User> updateUser(@RequestBody User user, @PathVariable("username") String username) {
		System.out.println(username + " " + user);
		return new ResponseEntity<User>(uservice.updateUser(user, username), HttpStatus.OK);
	}

	
	/** .User Delete By UserName */
	@DeleteMapping("/delete/{username}")
	public ResponseEntity<String> deleteUser(@PathVariable("username") String username) {

		return new ResponseEntity<String>(uservice.DeleteUserByUsername(username), HttpStatus.OK);
	}
	
	
	

	

	

	

}
