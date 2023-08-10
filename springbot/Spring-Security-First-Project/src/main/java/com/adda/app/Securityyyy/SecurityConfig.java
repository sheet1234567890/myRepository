package com.adda.app.Securityyyy;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.provisioning.JdbcUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {
	
	//password encoder............
	@Bean
	public BCryptPasswordEncoder passwordEncoder() 
	{
		return new BCryptPasswordEncoder();
	}
	
	//2.for JDBC Authentication..
	@Bean
	public UserDetailsService userDetailsService(DataSource datasourse) 
	{
		UserDetails user1 =User.withUsername("sheetal123256")
				.password("$2a$10$NBhGB3opElSHumpmzrNkueTx1PiJ3XYR2P9GPRigpStcDUZI/OzR6")
				.authorities("ADMIN").build();
		UserDetails user2 =User.withUsername("chetan123472")
				.password("$2a$10$NBhGB3opElSHumpmzrNkueTx1PiJ3XYR2P9GPRigpStcDUZI/OzR6")
				.authorities("COSTOMER").build();
		JdbcUserDetailsManager users = new JdbcUserDetailsManager(datasourse);
		users.createUser(user2);
		users.createUser(user1);
		         
		return users;
		
	}
	
	//authentication for jdbc.....
	@Bean
	public SecurityFilterChain configurePaths(HttpSecurity http) throws Exception  
	{
		http.
		authorizeHttpRequests(request->request.antMatchers("/home","/") .permitAll().antMatchers("/admin").hasAuthority("ADMIN").antMatchers("/customer").hasAuthority("COSTOMER").anyRequest().authenticated())
		.formLogin(form->form.loginPage("/login").permitAll())
		.logout(logout->logout.permitAll());
		return http.build();
		
	}
	
	//1.for Authentication(InMemory)..........
//	@Bean
//	public UserDetailsService userDetailsService() 
//	{
//		UserDetails user1 = User.withDefaultPasswordEncoder().username("sheetal").password("sheetal").roles("Admin").build();
//		UserDetails user2 = User.withDefaultPasswordEncoder().username("surbhi").password("surbhi").roles("Customer").build();
//		return  new InMemoryUserDetailsManager(user1,user2);
//	}
	
	//2.for Authorization..........
//	@Bean
//	public SecurityFilterChain configurePaths(HttpSecurity http) throws Exception  
//	{
//		http.
//		authorizeHttpRequests(request->request.antMatchers("/home","/") .permitAll().anyRequest().authenticated())
//		.formLogin(form->form.loginPage("/login").permitAll())
//		.logout(logout->logout.permitAll());
//		return http.build();
//		
//	}
	
	
	
	

}
