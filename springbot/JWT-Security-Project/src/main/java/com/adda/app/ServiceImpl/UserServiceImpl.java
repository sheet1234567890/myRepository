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

import com.adda.app.Reposatary.UserRepo;
import com.adda.app.Service.IUserService;
import com.adda.app.entity.User;
@Service
public class UserServiceImpl implements IUserService,UserDetailsService {

	 @Autowired
		private UserRepo urepo;
	    @Autowired
	    private BCryptPasswordEncoder passwordEncoder;
		
		
		
		public Integer saveUser(User user) {
			String encPwd = passwordEncoder.encode(user.getPassword());
			user.setPassword(encPwd);
			return urepo.save(user).getId();
		}

		
		public Optional<User> getOneUser(Integer id) {
			
			return urepo.findById(id);
		}

	
		public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
			Optional<User>optional = urepo.findByUsername(username);
			if(optional.isEmpty()) 
			{
				throw new UsernameNotFoundException(username+"Not Exist User ");
			}
			
			User user = optional.get();
			List<GrantedAuthority> authorities = user.getRoles()
					.stream().map(role->new SimpleGrantedAuthority(role))
					.collect(Collectors.toList());
			return new org.springframework.security.core.userdetails.User(username,user.getPassword(),authorities);
		}


		@Override
		public User findByUserName(String UserName) {
			Optional<User>opt = urepo.findByUsername(UserName);
			if(opt.isEmpty()) 
			{
				throw new UsernameNotFoundException("user Not Found");
			}
			return opt.get();
		}
}
