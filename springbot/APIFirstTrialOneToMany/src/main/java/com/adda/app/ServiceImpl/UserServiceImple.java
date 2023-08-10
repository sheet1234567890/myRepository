package com.adda.app.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.adda.app.Bean.Role;
import com.adda.app.Bean.User;
import com.adda.app.Service.UserService;
import com.adda.app.raposatary.Rolerepo;
import com.adda.app.raposatary.UserRepo;
@Service
public class UserServiceImple implements UserService {
	
    @Autowired
	private UserRepo urepo;

    @Autowired
    private Rolerepo repo;
    
	@Override
	public User createUser(User user) {
		
		return this.urepo.save(user) ;
	}

	@Override
	public String deleteUser(Integer id) {
		if(this.urepo.existsById(id)) 
		{
			this.urepo.deleteById(id);
			return "deleted successsfull";
		}
		return "not found user";
		
	}

	@Override
	public String updateUser(User user) {
		if(urepo.existsById(user.getUid())) 
		{
			urepo.save(user);
			return "Update Successfull";
			}
		return "User not found";
	}

	@Override
	public List<User> viewAll() {
		List<User>ulist=this.urepo.findAll();
		return ulist;
	}

	@Override
	public String deleteAll() {
		this.urepo.deleteAll();
		return"deleted.....";
	}

	@Override
	public User saveUser(User user) {
	Role role = this.repo.save(user.getRole());
	user.setRole(role);
		
		return this.urepo.save(user);
	}

}
