package com.adda.app.Test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.adda.app.bean.Token;

public class Test {                         //xml configuration.......Scope

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
      Token tob1 = ac.getBean("tob", Token.class);
      System.out.println(tob1.hashCode());
      Token tob2 = ac.getBean("tob",Token.class);
      System.out.println(tob2.hashCode());
	}

}
