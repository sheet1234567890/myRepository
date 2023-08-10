package com.adda.collections;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class studentCollection {                           //Collection type inject.........Settter injection
  private String S_name;
  private List<String>phones;
  private Set<String>Addresses;
  private Map<String,String>courses;
  
  
public String getS_name() {
	return S_name;
}
public void setS_name(String s_name) {
	S_name = s_name;
}
public List<String> getPhones() {
	return phones;
}
public void setPhones(List<String> phones) {
	this.phones = phones;
}
public Set<String> getAddresses() {
	return Addresses;
}
public void setAddresses(Set<String> addresses) {
	Addresses = addresses;
}
public Map<String, String> getCourses() {
	return courses;
}
public void setCourses(Map<String, String> courses) {
	this.courses = courses;
}
public studentCollection() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "studentCollection [S_name=" + S_name + ", phones=" + phones + ", Addresses=" + Addresses + ", courses="
			+ courses + "]";
}
}
