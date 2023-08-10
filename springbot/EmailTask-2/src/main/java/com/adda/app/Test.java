package com.adda.app;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;
@Component
public class Test  implements CommandLineRunner{
	@Autowired
  private Email e;
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
	  /*  AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(myConfig.class);
		Email e = ac.getBean("email",Email.class);*/
		System.out.println(e);
	}

}
