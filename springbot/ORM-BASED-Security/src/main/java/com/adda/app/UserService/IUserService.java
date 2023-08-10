package com.adda.app.UserService;

import java.util.Optional;

import com.adda.app.Entity.User;

public interface IUserService {

	public Integer saveUser(User user);
	Optional<User>getOneUser(Integer id);
}
