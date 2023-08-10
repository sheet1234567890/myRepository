package com.adda.bean;

public class Department {
   private Integer d_id;
   private String d_name;
   private Integer d_hike;
public Department() {
	super();
	// TODO Auto-generated constructor stub
}
public Integer getD_id() {
	return d_id;
}
public void setD_id(Integer d_id) {
	this.d_id = d_id;
}
public String getD_name() {
	return d_name;
}
public void setD_name(String d_name) {
	this.d_name = d_name;
}
public Integer getD_hike() {
	return d_hike;
}
public void setD_hike(Integer d_hike) {
	this.d_hike = d_hike;
}
@Override
public String toString() {
	return "Department [d_id=" + d_id + ", d_name=" + d_name + ", d_hike=" + d_hike + "]";
}
}
