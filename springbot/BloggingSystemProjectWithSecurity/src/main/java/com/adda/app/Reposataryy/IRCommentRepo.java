package com.adda.app.Reposataryy;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.adda.app.Entity.Comments;

public interface IRCommentRepo extends JpaRepository<Comments, Integer> {
    
	
	/**get Comment By PostId And CommentID*/
	@Query("Select c from Comments c where commentid=:cid And post.postId=:pid")
	public Optional<Comments> getCommentByPostIdAndCommentIdddd(Integer cid ,Integer pid);
	
	/**get Comment By PostId*/
	@Query("Select c from Comments c where post.postId=:pid")
	public List<Comments>getCommentByPostId1(Integer pid);
}
