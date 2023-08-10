package com.dolop1.app.Config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;
import org.springframework.core.env.Environment;

import com.dolop1.app.bean.DriverManager;

@Configuration
@ComponentScan("com.dollop.app")
@PropertySource("classpath:app.properties")
public class MyAppConfig 
{
   //1method=1 object
	@Autowired
	 private Environment env;
	@Bean
   	//@Scope("")                           classs ka scope............
	public DriverManager m1() 
	{
		DriverManager dm = new DriverManager();
		//dm.setDriverClass("MYSQL:JDBC:DRiVER");
		//dm.setUrl("mysql:jdbc://localhost:3306/");
		//dm.setDriverClass(env.getProperty("my.driver-Class"));
		//dm.setUrl(env.getProperty("my.url"));
		dm.setDriverClass("m1driver");
		dm.setUrl("m1url");
		System.out.println("1.conObj");
		return dm;
	}
	@Bean
	@Primary
	//@Scope("")                                methode scope...............
	public DriverManager m2() 
	{
		DriverManager dm = new DriverManager();
		//dm.setDriverClass("MYSQL:JDBC:DRiVER");
		//dm.setUrl("mysql:jdbc://localhost:3306/");
		//dm.setDriverClass(env.getProperty("my.driver-Class"));
		//dm.setUrl(env.getProperty("my.url"));
		dm.setDriverClass("m2Driver");
		dm.setUrl("m2url");
		System.out.println("2 conObj");
		return dm;
	}
}
