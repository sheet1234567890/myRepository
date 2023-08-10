package com.adda.Stereo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.adda.Stereo.Config.Config;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       ApplicationContext ac = new AnnotationConfigApplicationContext(Config.class);
       Student s = ac.getBean("student",Student.class);
       Student s1= ac.getBean("student",Student.class);
       System.out.println(s);
     //  System.out.println(s.hashCode());               //Cheaking Scope
     //  System.out.println(s1.hashCode());              //Cheaking Scope
//      Teacher t  = ac.getBean("teacher",Teacher.class);//Cheaking Scope
//      Teacher t1 = ac.getBean("teacher",Teacher.class);//Cheaking Scope
//      System.out.println(t1.hashCode()+"=>2.");         //Cheaking Scope
//      System.out.println(t.hashCode()+"=>1.");          //Cheaking Scope
	}

}                                                   
