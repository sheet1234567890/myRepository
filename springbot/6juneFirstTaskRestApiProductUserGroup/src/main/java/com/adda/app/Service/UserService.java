package com.adda.app.Service;

import com.adda.app.Entity.User;

public interface UserService {
public User RagisterUser(User user);
public User LoginUser(String email,String pass);
public String addProductByUser(User user);
}
