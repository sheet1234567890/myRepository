package com.adda.bean;

public class Employee {
   private Integer e_id;
   private String e_name;
   private Integer d_id;
   private Integer e_status;
   private Integer e_sal;
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
public Integer getD_id() {
	return d_id;
}
public void setD_id(Integer d_id) {
	this.d_id = d_id;
}
public Integer getE_status() {
	return e_status;
}
public void setE_status(Integer e_status) {
	this.e_status = e_status;
}
public Integer getE_sal() {
	return e_sal;
}
public void setE_sal(Integer e_sal) {
	this.e_sal = e_sal;
}
@Override
public String toString() {
	return "Employee [e_id=" + e_id + ", e_name=" + e_name + ", d_id=" + d_id + ", e_status=" + e_status + ", e_sal="
			+ e_sal + "]";
}
   
}