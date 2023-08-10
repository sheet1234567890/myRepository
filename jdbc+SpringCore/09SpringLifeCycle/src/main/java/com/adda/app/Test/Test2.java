package com.adda.app.Test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.adda.app.bean.Token;
import com.adda.app.config.myconfig;                       //java Configuration.....Scope

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    ApplicationContext ac = new AnnotationConfigApplicationContext(myconfig.class);
    Token tob1 = ac.getBean("token", Token.class);
    System.out.println(tob1.hashCode());
    Token tob2 = ac.getBean("token",Token.class);
    System.out.println(tob2.hashCode());
	}

}
