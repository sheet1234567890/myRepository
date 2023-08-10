package com.adda.Stereo;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Student {
    @Value("sheetal")
	private String name;
    @Value("10")
	private Integer id;
    @Value("${Sheetal,Surbhi,Shivi,Suhana}")
    private List<String> n;
	public List<String> getN() {
		return n;
	}
	public void setN(List<String> n) {
		this.n = n;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public String toString() {
		return "Student [name=" + name + ", id=" + id + ", n=" + n + "]";
	}
	
	
}
