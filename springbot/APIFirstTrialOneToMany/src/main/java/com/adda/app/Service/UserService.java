package com.adda.app.Service;

import java.util.List;

import com.adda.app.Bean.User;

public interface UserService {

	public User createUser(User user);
	public String deleteUser(Integer id);
	public String updateUser(User user);
	public List<User> viewAll();
	public String deleteAll();
	
	public User saveUser(User user);
}
