package com.adda.AnnotationConfiguration;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Demo {                        //Annotation configuration........from youtube
    private String name;

	@Override
	public String toString() {
		return "Demo [name=" + name + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
    
	public Demo() {
		super();
		// TODO Auto-generated constructor stub
	}
	@PostConstruct
	public void Start() {
		System.out.println("starting method");
	}
	@PreDestroy
	public void end() {
		System.out.println("ending method");
	}
	
}
