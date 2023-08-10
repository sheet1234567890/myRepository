package com.adda.app.Service;

import java.util.List;
import java.util.Optional;

import com.adda.app.Entity.Comments;

public interface ICommentService {

	/**get Comment By Comment Id And Post Id*/
	public Optional<Comments> getCommentBycidAndPostId(Integer cid,Integer pid);
	/**get Comment By Post Id*/
	public List<Comments> getCommentByPostId(Integer pid);
	/**create comment specific post With (post id)*/
	public Comments CreateCommentOnPost(Comments comments,Integer id);
	/**Delete Comment By Id*/
	public String deleteCommentsById(Integer pid,Integer cid);
}
