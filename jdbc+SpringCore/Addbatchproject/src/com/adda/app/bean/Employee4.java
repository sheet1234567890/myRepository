package com.adda.app.bean;

public class Employee4 {
  private Integer E_id;
  private String E_name;
  private Integer E_salary;
public Employee4() {
	super();
	// TODO Auto-generated constructor stub
}
public Integer getE_id() {
	return E_id;
}
public void setE_id(Integer e_id) {
	E_id = e_id;
}
public String getE_name() {
	return E_name;
}
public void setE_name(String e_name) {
	E_name = e_name;
}
public Integer getE_salary() {
	return E_salary;
}
public void setE_salary(Integer e_salary) {
	E_salary = e_salary;
}
@Override
public String toString() {
	return "Employee4 [E_id=" + E_id + ", E_name=" + E_name + ", E_salary=" + E_salary + "]";
}
}
