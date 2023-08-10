package com.adda.app.lifecycle.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.adda.app.lifecycle.Samosa;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    //  ApplicationContext ac = new ClassPathXmlApplicationContext("config.xml");
		AbstractApplicationContext ac = new ClassPathXmlApplicationContext("config.xml");
      Samosa s = (Samosa)ac.getBean("sheetal");
      System.out.println(s);
      ac.registerShutdownHook();
	}

}
