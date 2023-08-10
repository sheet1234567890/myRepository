package com.adda.app.Test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.adda.app.bean.Employee;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       ApplicationContext ac = new ClassPathXmlApplicationContext("config.xml");
       Employee e = ac.getBean("employee",Employee.class);
       System.out.println(e);
	}

}
