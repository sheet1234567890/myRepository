package com.adda.collection.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.adda.collections.studentCollection;

public class CollectionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      ApplicationContext ac = new ClassPathXmlApplicationContext("collectionbean.xml");
      studentCollection s = (studentCollection) ac.getBean("sheetal");
      System.out.println(s.getS_name());
      System.out.println(s.getPhones());
      System.out.println(s.getAddresses());
      System.out.println(s.getCourses());
	}

}
