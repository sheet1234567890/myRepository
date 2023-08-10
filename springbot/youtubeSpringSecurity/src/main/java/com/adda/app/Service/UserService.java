package com.adda.app.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.adda.app.Model.User;
@Service
public class UserService {

	List<User>list=new ArrayList();	
public UserService() {
	list.add(new User("sheetal","123","sheetal@gmail.com"));
	list.add(new User("surbhi","123","surbhi@gmail.com"));
	list.add(new User("ishwari","123","ishh@gmail.com"));
	list.add(new User("minakshi","123","minu@gmail.com"));
	list.add(new User("vandana","123","vann@gmail.com"));
}
public User CreateUser(User user) 
{
	this.list.add(user);
	return user;
}


//Get All User
public List<User>viewUser()
{
	return this.list;
}
public User ViewUserById(String username) 
{
	return this.list.stream().filter((user)->user.getUserName().equals(username)).findAny().orElse(null);
}

}
