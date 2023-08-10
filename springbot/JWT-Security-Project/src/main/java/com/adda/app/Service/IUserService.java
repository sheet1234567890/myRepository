package com.adda.app.Service;

import java.util.Optional;

import org.springframework.security.core.userdetails.UserDetails;

import com.adda.app.entity.User;

public interface IUserService {

	public Integer saveUser(User user) ;
	public Optional<User> getOneUser(Integer id);
	public User findByUserName(String UserName);
	public UserDetails loadUserByUsername(String username);
	
}
