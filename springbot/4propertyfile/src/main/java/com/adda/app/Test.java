package com.adda.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

import com.adda.app.DBConnection;
import com.adda.app.MyConfig;
@Component
public class Test implements CommandLineRunner{
    @Autowired  
	private DBConnection d;
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println(d);
	}

}
