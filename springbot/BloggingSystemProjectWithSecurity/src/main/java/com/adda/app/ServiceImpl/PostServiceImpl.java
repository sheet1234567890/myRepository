package com.adda.app.ServiceImpl;

import java.security.Principal;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.adda.app.Entity.Post;
import com.adda.app.Entity.User;
import com.adda.app.Exceptions.PostNotFoundException;
import com.adda.app.Exceptions.UserNotFoundException;
import com.adda.app.Reposataryy.IRPostRepo;
import com.adda.app.Reposataryy.IRUserRepo;
import com.adda.app.Service.IPostService;

@Service
public class PostServiceImpl implements IPostService {
	/** User Repository.. */
	@Autowired
	private IRUserRepo urepo;
	/** Post Repository.. */
	@Autowired
	private IRPostRepo prepo;

	/** Create Post... */
	@Override
	public Post CreatePost(Post post,Principal p1) {
		User u = urepo.getUserByUserName(p1.getName());
		post.setUser(u);
		Integer uid = post.getUser().getUid();
		Optional<User> id = urepo.findById(uid);
		Post p = null;
		if (id.isPresent()) {
			p = prepo.save(post);
		} else {
			/** Handle Exception Invalid User.... */
			throw new UserNotFoundException("User Not Avalabaile");
		}
		return p;
	}

	/**
	 * Get All Post
	 */
	@Override
	public List<Post> getAllPost() {

		return prepo.findAll();
	}

	/** Get Post By Specific Id */
	@Override
	public Optional<Post> getPostById(Integer id) {

		// Post p= prepo.getPostByUserId(id);
		Optional<Post> p = prepo.findById(id);
		if (p == null) {
			throw new PostNotFoundException("post not found ...");
		} else
			return p;

	}

	/** Delete Post By id */
	@Override
	public String DeletePostById(Integer id) {

		Optional<Post> p = prepo.findById(id);
		if (p.isPresent()) {
			prepo.delete(p.get());
			return "Post SuccessFull Delete";
		} else {
			throw new PostNotFoundException("post not Available");
		}

	}

	/** Update Post */
	@Override
	public Post updatePostById(Post post, Integer id) {
		if (prepo.existsById(id)) {

			return prepo.save(post);
		} else {
			throw new PostNotFoundException("post not Available");
		}
	}

	

}
