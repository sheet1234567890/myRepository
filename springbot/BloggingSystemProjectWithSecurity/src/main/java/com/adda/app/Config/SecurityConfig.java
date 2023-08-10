package com.adda.app.Config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityCustomizer;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.AuthenticationEntryPoint;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import com.adda.app.Filter.SecurityFilter;

@Configuration
@EnableWebSecurity
public class SecurityConfig {
	/** For PassWord Encode*/
	@Autowired
	private BCryptPasswordEncoder passwoerEncoder;
	/**For User Details Services*/
	@Autowired
	private UserDetailsService userDetailsService;
	
	@Autowired
	private AuthenticationEntryPoint authenticationEntryPoint;
   @Autowired
	private SecurityFilter securityfilter;
	
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
		 http.csrf().disable()
		.authorizeRequests().antMatchers("/api/auth/signup","/api/auth/signin","/swagger-ui/**").permitAll()
		.antMatchers("/api/user/").hasAuthority("ADMIN")
		.antMatchers("/api/user/{username}").hasAuthority("ADMIN")
		.antMatchers("/api/user/{username}").hasAuthority("USER")
		.antMatchers("/api/user/delete/{username}").hasAuthority("ADMIN")
		.antMatchers("/api/user/delete/{username}").hasAuthority("USER")
		.anyRequest().authenticated()
		.and()
		.exceptionHandling()
		.authenticationEntryPoint(authenticationEntryPoint)
		.and()
		.sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS)
		.and()
		.addFilterBefore(securityfilter, UsernamePasswordAuthenticationFilter.class);
		return http.build();
		
	}
	
//	@Bean
//    public WebSecurityCustomizer webSecurityCustomizer() {
//        return (web)
//-> web.ignoring().antMatchers("/v3/api-docs/**");
//    }
	
	
}
