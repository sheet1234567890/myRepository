package com.adda.app.ServiceImpl;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.adda.app.Entity.User;
import com.adda.app.MyDuplicateEmailException.DuplicateEmail;
import com.adda.app.Reposataryy.UserRepo;
import com.adda.app.Service.UserService;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
	private UserRepo urepo;
	@Override
	public User RagisterUser(User user) {
		user.setCreated(new Date().toString());
		User u=null;
		
		Integer id = urepo.getUidByEmail(user.getUemail());
		if(id==null) {
		 u= urepo.save(user);
		}
		
		else {
			throw new DuplicateEmail("Email Already exist");
		}
		
		 return u;
	}
	@Override
	public User LoginUser(String email, String pass) {
		User u = urepo.getUserByEmailAndPass(email, pass);
		if(u==null) {
			throw new com.adda.app.MyDuplicateEmailException.UserNotFound("User Not Available");
		}
		return u;
		}
	@Override
	public String addProductByUser(User user) {
		if(urepo.existsById(3)) 
		{
			urepo.save(user);
			return "successfull addd product by user";
		}
		return "User Not Found";
		}
	
	}

	

