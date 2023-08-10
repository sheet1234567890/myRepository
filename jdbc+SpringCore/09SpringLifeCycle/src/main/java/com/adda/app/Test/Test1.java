package com.adda.app.Test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.adda.app.bean.Token1;
import com.adda.app.config.myconfig;
import com.adda.app.service.TokenService;
                                                   
public class Test1 {                           //Annotation......Scope

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    ApplicationContext ac = new  AnnotationConfigApplicationContext(myconfig.class);
    TokenService tob1 = ac.getBean("tokenService" , TokenService.class);
    System.out.println(tob1.getToken());
    Token1 tk1 = tob1.getToken();
    System.out.println(tob1.hashCode()+" "+tk1.hashCode());
    
    TokenService tob2 = ac.getBean("tokenService" , TokenService.class);
    System.out.println(tob2.getToken());
    Token1 tk2 = tob2.getToken();
    System.out.println(tob2.hashCode()+" "+tk2.hashCode());
    
    TokenService tob3 = ac.getBean("tokenService" , TokenService.class);
    System.out.println(tob3.getToken());
    Token1 tk3 = tob3.getToken();
    System.out.println(tob3.hashCode()+" "+tk3.hashCode());
    
	}
}
