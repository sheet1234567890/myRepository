package com.adda.app.Bean;

public class Employee {
  private Integer e_id;
  private String e_name;
  private Double e_sal;
  private String e_depart;
public Employee() {
	super();
	// TODO Auto-generated constructor stub
}
public Integer getE_id() {
	return e_id;
}
public void setE_id(Integer e_id) {
	this.e_id = e_id;
}
public String getE_name() {
	return e_name;
}
public void setE_name(String e_name) {
	this.e_name = e_name;
}
public Double getE_sal() {
	return e_sal;
}
public void setE_sal(Double e_sal) {
	this.e_sal = e_sal;
}
public String getE_depart() {
	return e_depart;
}
public void setE_depart(String e_depart) {
	this.e_depart = e_depart;
}
@Override
public String toString() {
	return "Employee [e_id=" + e_id + ", e_name=" + e_name + ", e_sal=" + e_sal + ", e_depart=" + e_depart + "]";
}
  
}
