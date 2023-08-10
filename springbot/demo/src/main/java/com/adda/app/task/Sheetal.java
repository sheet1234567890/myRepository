package com.adda.app.task;

import org.springframework.beans.factory.annotation.Value;

public class Sheetal {
	@Value("sheetal patidar")
 private String name;
	@Value("100")
 private Integer id;
	@Value("1234.4f")
 private Float salary;
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
public Float getSalary() {
	return salary;
}
public void setSalary(Float salary) {
	this.salary = salary;
}
public Sheetal() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "Sheetal [name=" + name + ", id=" + id + ", salary=" + salary + "]";
}
}
