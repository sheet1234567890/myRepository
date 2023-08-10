package com.adda.bean3;

public class Emp3 {
   private Integer e_id;
   private Integer department_id;
   private String e_name;
   private String e_email;
   private String e_location;
public Emp3() {
	super();
	// TODO Auto-generated constructor stub
}
public Integer getE_id() {
	return e_id;
}
public void setE_id(Integer e_id) {
	this.e_id = e_id;
}
public Integer getDepartment_id() {
	return department_id;
}
public void setDepartment_id(Integer department_id) {
	this.department_id = department_id;
}
public String getE_name() {
	return e_name;
}
public void setE_name(String e_name) {
	this.e_name = e_name;
}
public String getE_email() {
	return e_email;
}
public void setE_email(String e_email) {
	this.e_email = e_email;
}
public String getE_location() {
	return e_location;
}
public void setE_location(String e_location) {
	this.e_location = e_location;
}
@Override
public String toString() {
	return "Emp3 [e_id=" + e_id + ", department_id=" + department_id + ", e_name=" + e_name + ", e_email=" + e_email
			+ ", e_location=" + e_location + "]";
}
}
