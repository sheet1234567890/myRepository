package com.adda.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
@Component
public class Test implements CommandLineRunner{
@Autowired
 private Student s;

@Override
public void run(String... args) throws Exception {
	// TODO Auto-generated method stub
	System.out.println(s);
}
 
}
