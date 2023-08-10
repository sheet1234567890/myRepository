package com.adda.AnnotationConfiguration.Test;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.adda.AnnotationConfiguration.Demo;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      AbstractApplicationContext ac = new ClassPathXmlApplicationContext("config.xml");
      Demo d = (Demo)ac.getBean("sheetal");
      System.out.println(d);
      ac.registerShutdownHook();
	}

}
