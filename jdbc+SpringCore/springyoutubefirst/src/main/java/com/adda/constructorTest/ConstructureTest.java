package com.adda.constructorTest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.adda.constructorinjection.Person;

public class ConstructureTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      ApplicationContext ac = new ClassPathXmlApplicationContext("constructorconfig.xml");
      Person p = (Person)ac.getBean("sheetal");
      System.out.println(p);
	}

}
