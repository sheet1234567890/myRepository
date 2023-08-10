package com.adda.app.Test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.adda.app.bean.Student;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
        ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        
        Student s= ac.getBean("student2",Student.class);
        Student s1 = ac.getBean("student1",Student.class);
        System.out.println(s1);
        System.out.println(s);
	}

}
