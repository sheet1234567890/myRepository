package com.adda.app.Controller;

import java.security.Principal;
import java.util.List;
import java.util.Optional;

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

import com.adda.app.Entity.Post;
import com.adda.app.Entity.User;
import com.adda.app.Service.IPostService;
import com.adda.app.Service.IUserService;

/** Product Controller.. */
@RestController
@RequestMapping("/api/posts")
public class PostController {
	/** Post Service */
	@Autowired
	private IPostService pservice;

	@Autowired
	private IUserService uservice;

	/** Create Post */
	@PostMapping("/api/create")
	public ResponseEntity<Post> createPost(@RequestBody Post post, Principal p)

	{

		return new ResponseEntity<Post>(pservice.CreatePost(post, p), HttpStatus.CREATED);
	}

	/** Get All Post.. */
	@GetMapping("/getAllPost")
	public ResponseEntity<List<Post>> getAllPost() {
		return new ResponseEntity<List<Post>>(pservice.getAllPost(), HttpStatus.CREATED);
	}

	/** Get Post By Id */
	@GetMapping("/{id}")
	public ResponseEntity<Optional<Post>> getPostById(@PathVariable("id") Integer id) {
		return new ResponseEntity<Optional<Post>>(pservice.getPostById(id), HttpStatus.CREATED);
	}

	/** Delete Post By Id */
	@DeleteMapping("/deletepost/{id}")
	public ResponseEntity<String> deletepostById(@PathVariable("id") Integer id) {
		return new ResponseEntity<String>(pservice.DeletePostById(id), HttpStatus.OK);

	}

	/** Update Post By Id */
	@PutMapping("/updatePost/{id}")
	public ResponseEntity<Post> updatePostById(@RequestBody Post post, @PathVariable Integer id) {
		return new ResponseEntity<Post>(pservice.updatePostById(post, id), HttpStatus.OK);
	}
}
