package com.adda.app.Reposataryy;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.adda.app.Entity.User;

public interface UserRepo extends JpaRepository<User, Integer> {

	@Query("Select  u.uid from User u  where u.uemail=:email")
	public Integer getUidByEmail(String email);
	
	@Query("Select u from User u where uemail=:email And upass=:pass")
	public User getUserByEmailAndPass(String email,String pass);
}
