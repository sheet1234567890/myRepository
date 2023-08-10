package com.adda.app.task;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;
@Component
public class Test implements CommandLineRunner
{

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
	AnnotationConfigApplicationContext ac  = new AnnotationConfigApplicationContext(MyConfig.class);	
    DBConnection d = ac.getBean("ob",DBConnection.class);
    System.out.println(d);
	}

}
