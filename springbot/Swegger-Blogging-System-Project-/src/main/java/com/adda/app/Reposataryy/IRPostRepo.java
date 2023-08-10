package com.adda.app.Reposataryy;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.adda.app.Entity.Post;

public interface IRPostRepo extends JpaRepository<Post, Integer> {

	/**get Post By User Id*/
	@Query("Select p from Post p where p.user.uid=:id")
    public Post getPostByUserId(Integer id);
	/**get Post By PostId*/
    @Query("Select p.postId from Post p where p.postId=:pId")
	public Integer getPostByPostId(Integer pId);
}
