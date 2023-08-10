package com.adda.app.Bean;

public class Employee {
   private Integer eid;
   private String ename;
   private String edep;
   private Double esal;
public Employee() {
	super();
	// TODO Auto-generated constructor stub
}
public Integer getEid() {
	return eid;
}
public void setEid(Integer eid) {
	this.eid = eid;
}
public String getEname() {
	return ename;
}
public void setEname(String ename) {
	this.ename = ename;
}
public String getEdep() {
	return edep;
}
public void setEdep(String edep) {
	this.edep = edep;
}
public Double getEsal() {
	return esal;
}
public void setEsal(Double esal) {
	this.esal = esal;
}
@Override
public String toString() {
	return "Employee [eid=" + eid + ", ename=" + ename + ", edep=" + edep + ", esal=" + esal + "]";
}
   
}
