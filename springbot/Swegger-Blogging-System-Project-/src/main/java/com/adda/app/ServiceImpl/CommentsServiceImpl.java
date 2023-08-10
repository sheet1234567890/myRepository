package com.adda.app.ServiceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.adda.app.Entity.Comments;
import com.adda.app.Entity.Post;
import com.adda.app.Exceptions.PostNotFoundException;
import com.adda.app.Reposataryy.IRCommentRepo;
import com.adda.app.Reposataryy.IRPostRepo;
import com.adda.app.Service.ICommentService;

@Service
public class CommentsServiceImpl implements ICommentService {
	@Autowired
	private IRCommentRepo crepo;
	@Autowired
	private IRPostRepo prepo;

	/** get Comment By Comment Id And Post Id */
	@Override
	public Optional<Comments> getCommentBycidAndPostId(Integer cid, Integer pid) {

		Optional<Comments> c = crepo.getCommentByPostIdAndCommentIdddd(cid, pid);
		if (c.isEmpty()) {
			throw new PostNotFoundException("Post Not Availble.....");
		} else

			return c;
	}

	/** get Comment By PostId.. */
	@Override
	public List<Comments> getCommentByPostId(Integer pid) {
		Optional<Post> post = prepo.findById(pid);
		if (post.isEmpty()) {
			throw new PostNotFoundException("post not found....");
		} else
			return crepo.getCommentByPostId1(post.get().getPostId());
	}

	/** Create Comment on post */
	@Override
	public Comments CreateCommentOnPost(Comments comments, Integer id) {
		Post p = null;
		if (prepo.existsById(id)) {
			Optional<Post> post = prepo.findById(id);
			if (post.isPresent()) {
				p = post.get();
			}
		}
		if (p != null) {
			comments.setPost(p);
			return crepo.save(comments);
		} else {

			throw new PostNotFoundException("Post Not Found");
		}
	}
	@Override
	public String deleteCommentsById(Integer pid, Integer cid) {
		Optional<Comments> c = crepo.getCommentByPostIdAndCommentIdddd(cid, pid);
		if (c.isPresent()) {
			crepo.delete(c.get());
			return "Comment delete SuccessFull...";
		} else {
			throw new PostNotFoundException("Post Not Found");
		}
	}
}
