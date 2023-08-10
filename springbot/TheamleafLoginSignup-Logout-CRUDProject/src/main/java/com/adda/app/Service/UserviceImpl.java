package com.adda.app.Service;

import java.util.Arrays;

import org.springframework.stereotype.Service;

import com.adda.app.Bean.Role;
import com.adda.app.Bean.User;
import com.adda.app.repo.Ureposatary;
import com.adda.pp.userDto.UserRagistrationDto;

@Service
public class UserviceImpl implements UService{
	private Ureposatary urepo;
	
	
	public UserviceImpl(Ureposatary urepo) {
		super();
		this.urepo = urepo;
	}
	
	@Override
	public User save(UserRagistrationDto udto) {
		
		User user=new User(udto.getFname(),udto.getLname(),udto.getEmail(),udto.getPassword(),Arrays.asList(new Role("ROLE_USER")));
		return this.urepo.save(user);
	}

}
