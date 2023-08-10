package com.adda.app.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.adda.app.bean.Token;

@ComponentScan("com.adda.app")
//@Configuration
public class myconfig {
//	@Bean
//    @Scope("prototype")
//	public Token token() 
//  {
//	  return new Token();
//  }
}
