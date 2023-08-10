package com.adda.app.bean;

import org.springframework.beans.factory.annotation.Autowired;

import com.adda.app.bean1.Address;



public class Employee {
	@Autowired                                 //incomplit..........
  private Address address;

public Employee(Address address) {
	super();
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
