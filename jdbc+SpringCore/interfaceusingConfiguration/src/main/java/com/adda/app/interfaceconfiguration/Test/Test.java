package com.adda.app.interfaceconfiguration.Test;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.adda.app.interfaceconfiguration.Pepsi;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       AbstractApplicationContext ac = new ClassPathXmlApplicationContext("config.xml");
       Pepsi p = (Pepsi)ac.getBean("sheetal");
       ac.registerShutdownHook();
       System.out.println(p);
      // ac.registerShutdownHook();
	}

}
