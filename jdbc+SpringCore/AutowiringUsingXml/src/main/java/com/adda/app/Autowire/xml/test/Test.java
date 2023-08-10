package com.adda.app.Autowire.xml.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.adda.app.Autowire.xml.bean.Address;
import com.adda.app.Autowire.xml.bean.Employee;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    ApplicationContext ac = new ClassPathXmlApplicationContext("config.xml");
   Employee e = (Employee)ac.getBean("e",Employee.class);
   // Address a = (Address)ac.getBean("sheetal");
    System.out.println(e);
	}

}
