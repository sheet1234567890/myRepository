package com.adda.app.ServiceImpl;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.adda.app.Entity.User;
import com.adda.app.Reposatary.UserRepo;
import com.adda.app.UserService.IUserService;
@Service
public class UserServiceImpl implements IUserService ,UserDetailsService{
    @Autowired
	private UserRepo urepo;
    @Autowired
    private BCryptPasswordEncoder passwordEncoder;
	@Override
	
	
	public Integer saveUser(User user) {
		String encPwd = passwordEncoder.encode(user.getUserPassword());
		user.setUserPassword(encPwd);
		return urepo.save(user).getUserId();
	}

	@Override
	public Optional<User> getOneUser(Integer id) {
		
		return urepo.findById(id);
	}

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Optional<User>optional = urepo.findByUserEmail(username);
		if(optional.isEmpty()) 
		{
			throw new UsernameNotFoundException(username+"Not Exist User ");
		}
		
		User user = optional.get();
		List<GrantedAuthority> authorities = user.getUserRoles()
				.stream().map(role->new SimpleGrantedAuthority(role))
				.collect(Collectors.toList());
		return new org.springframework.security.core.userdetails.User(username,user.getUserPassword(),authorities);
	}

}
