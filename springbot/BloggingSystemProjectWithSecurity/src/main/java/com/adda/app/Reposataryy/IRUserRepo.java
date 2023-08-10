package com.adda.app.Reposataryy;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.adda.app.Entity.User;

public interface IRUserRepo extends JpaRepository<User, Integer>{

	/** Fetch Id By Email to match email in this id... Already Exist Or Not Exist in database*/
	@Query("Select  u.uid from User u  where u.email=:uemail")
	public Integer getUidByEmail(String uemail);
	
	
	/** Fetch Id By UserName to match UserName in this id... Already Exist Or Not Exist in database*/
	@Query("Select  u.uid from User u  where u.username=:username")
	public Integer getUidByUserName(String username);
	
	/**Cheak Email And PassWord User Valid Or Not(Login) */
	@Query("Select u from User u where u.email=:Email And u.password=:pass")
	public User getUserByEmailAndPass(String Email,String pass);
	
	/** get User Profile By User Name */
	@Query("Select u from User u where u.username=:name")
	public User getUserByUserName(String name);
	
	/**get User By userId*/
	@Query("Select u.uid from User u where u.uid=:id")
	public Integer getUserbyUserId(Integer id);
	
	Optional<User> findByUsername(String username);


//    /**Update Role User to Admin Admin to user*/ 
//	@Query("")
//	public User updateRole(String name);
//	
//	
}
