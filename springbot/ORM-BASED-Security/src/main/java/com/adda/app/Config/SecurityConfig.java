package com.adda.app.Config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {
	/** For PassWord Encode*/
	@Autowired
	private BCryptPasswordEncoder passwoerEncoder;
	/**For User Details Services*/
	@Autowired
	private UserDetailsService userDetailsService;

	/**For Authentication.....*/
	@Bean
	public AuthenticationManager authenticationManager(AuthenticationConfiguration authConfig) throws Exception 
	{
		return authConfig.getAuthenticationManager();
	}
	@Bean
	public DaoAuthenticationProvider authenticationProvider() 
	{
		DaoAuthenticationProvider provider  =  new DaoAuthenticationProvider();
		provider.setPasswordEncoder(passwoerEncoder);
		provider.setUserDetailsService(userDetailsService);
		return provider;
	}
	
	
/** For authorization*/	
	@Bean
	public SecurityFilterChain configurePaths(HttpSecurity http) throws Exception  
	{
		http.
		authorizeHttpRequests(request->request.antMatchers("/home","/","/user/**") .permitAll().antMatchers("/admin").hasAuthority("ADMIN").antMatchers("/customer").hasAuthority("COSTOMER").anyRequest().authenticated())
		.formLogin(form->form.loginPage("/login").permitAll().defaultSuccessUrl("/hello"))
		.logout(logout->logout.permitAll());
		return http.build();
		
	}
	
	
}
