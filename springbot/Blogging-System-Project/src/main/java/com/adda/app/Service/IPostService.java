package com.adda.app.Service;

import java.util.List;
import java.util.Optional;

import com.adda.app.Entity.Post;

/**Post Service..*/
public interface IPostService {

	
	public Post CreatePost(Post post);
	public List<Post>getAllPost();
	public Optional<Post> getPostById(Integer id);
	public String DeletePostById(Integer id);
	public Post updatePostById(Post post,Integer id);
}
