package com.adda.app.Service;


import com.adda.app.Entity.Album;
import com.adda.app.Entity.Comments;
import com.adda.app.Entity.LoginUser;
import com.adda.app.Entity.Post;
import com.adda.app.Entity.Todos;
import com.adda.app.Entity.User;

public interface IUserService {

	
	
	
	public User RagisterUser(User user);
	/**User Login Process */
	public User SignUpUser(String email,String pass);
	/**User Login By LoginUser */
	public User LoginUser(LoginUser loginuser) ;
	/** UserProfile By User Name */
	public User profile(String username);
   /**Get Post By UserName...*/
	public Post getPostByUserName(String Name);
	/**Get Album By UserName*/
	public Album getAlbumByUserName(String Name);
	/**Check User Name Available or not*/
	public String CheakUserName(String Name);
	/**Cheak User Email Available or Not*/
	public String CheakUserEmail(String email);
	/**Create Comment by User*/
	public Comments CreateComment(Comments comment);
	/**Create Todo By User*/
	public Todos CreateTodos(Todos todos);
	/**Update User*/
	public User updateUser(User user,String name);
	/**Delete User By Name*/
	public String DeleteUserByUsername(String name);
	/**Admin role to User And User to Admin..*/
	public User updateRole(String name);
}
