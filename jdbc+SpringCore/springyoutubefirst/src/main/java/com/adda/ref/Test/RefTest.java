package com.adda.ref.Test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.adda.ref.A;
import com.adda.ref.b.B;

public class RefTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ApplicationContext ac = new ClassPathXmlApplicationContext("refrence.xml");
        A a = (A)ac.getBean("aref");
        System.out.println(a.getX());
        System.out.println(a.getOb());
        B b = (B)ac.getBean("bref");
        System.out.println(b.getY());
	}

}
