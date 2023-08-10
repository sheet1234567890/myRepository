package com.adda.app;

public class EmployeeWorklocation {
   private Integer e_id;
   private String e_name;
   private String e_email;
   private String e_worklocation;
   private String e_join_date;
public EmployeeWorklocation() {
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
public String getE_email() {
	return e_email;
}
public void setE_email(String e_email) {
	this.e_email = e_email;
}
public String getE_worklocation() {
	return e_worklocation;
}
public void setE_worklocation(String e_worklocation) {
	this.e_worklocation = e_worklocation;
}
public String getE_join_date() {
	return e_join_date;
}
public void setE_join_date(String e_join_date) {
	this.e_join_date = e_join_date;
}
@Override
public String toString() {
	return "EmployeeWorklocation [e_id=" + e_id + ", e_name=" + e_name + ", e_email=" + e_email + ", e_worklocation="
			+ e_worklocation + ", e_join_date=" + e_join_date + "]";
}
   
}
