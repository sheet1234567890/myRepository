package com.adda.app.Autowire.xml.bean;

import org.springframework.stereotype.Component;

@Component("e")
public class Employee {
 private Address address;

public Employee(Address address) {
	super();
	System.out.println("constructure");
	
	this.address = address;
}

public Employee() {
	super();
	// TODO Auto-generated constructor stub
}

public Address getAddress() {
	return address;
}

public void setAddress(Address address) {
	this.address = address;
}

@Override
public String toString() {
	return "Employee [address=" + address + "]";
}



 
}
