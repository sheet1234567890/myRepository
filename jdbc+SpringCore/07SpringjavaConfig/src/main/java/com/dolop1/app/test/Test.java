package com.dolop1.app.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.dollop.app.service.DriverManagerService;
import com.dolop1.app.Config.MyAppConfig;
import com.dolop1.app.bean.DriverManager;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(MyAppConfig.class);
     //   DriverManager dob = ac.getBean("conObj",DriverManager.class);
        DriverManagerService dob=ac.getBean("dbs",DriverManagerService.class);
        System.out.println(dob);
	}

}
