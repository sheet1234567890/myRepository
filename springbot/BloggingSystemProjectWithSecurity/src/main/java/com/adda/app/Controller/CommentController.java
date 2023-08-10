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
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.adda.app.Entity.Comments;
import com.adda.app.Service.ICommentService;
import com.adda.app.Service.IUserService;

@RequestMapping("/api/post")
@RestController
public class CommentController {

	@Autowired
	private ICommentService cservice;
	@Autowired
	private IUserService uservice;

	/** Create Comment By User.. */
	@PostMapping("/create")
	public ResponseEntity<Comments> CreateComment(@RequestBody Comments comments,Principal p) {
		return new ResponseEntity<Comments>(uservice.CreateComment(comments,p), HttpStatus.CREATED);
	}

	/** get Comment By Comment Id And Post Id */
	@GetMapping("/{pid}/comments/{cid}")
	public ResponseEntity<Optional<Comments>> getCommentByCidAndPid(@PathVariable("cid") Integer cid,
			@PathVariable("pid") Integer pid) {
		return new ResponseEntity<Optional<Comments>>(cservice.getCommentBycidAndPostId(cid, pid), HttpStatus.OK);
	}

	/** get Comment By Post Id */
	@GetMapping("/{pid}/comments")
	public ResponseEntity<List<Comments>> getCommentByPostId(@PathVariable("pid") Integer pid) {
		return new ResponseEntity<List<Comments>>(cservice.getCommentByPostId(pid), HttpStatus.OK);
	}

	/** create comment specific post With (post id) */
	@PostMapping("/createCommentOnPost/{id}")
	public ResponseEntity<Comments> createCommentOnPost(@RequestBody Comments comments,
			@PathVariable("id") Integer id) {
		return new ResponseEntity<Comments>(cservice.CreateCommentOnPost(comments, id), HttpStatus.CREATED);
	}

	/** Delete Comment By Id */
	@DeleteMapping("/{pid}/deleteComment/{cid}")
	public ResponseEntity<String> deleteCommentById(@PathVariable("pid") Integer pid,
			@PathVariable("cid") Integer cid) {
		return new ResponseEntity<String>(cservice.deleteCommentsById(pid, cid), HttpStatus.OK);
	}

}
