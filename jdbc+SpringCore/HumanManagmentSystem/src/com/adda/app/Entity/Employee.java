package com.adda.app.Entity;

import java.util.Date;

public class Employee {

	private Integer empid;
	private String empname;
	private String empdep;
	private String empGender;
	private String worklocation;
	private String cuurentLocation;
	private  Date joindate;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Integer getEmpid() {
		return empid;
	}
	public void setEmpid(Integer empid) {
		this.empid = empid;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public String getEmpdep() {
		return empdep;
	}
	public void setEmpdep(String empdep) {
		this.empdep = empdep;
	}
	public String getEmpGender() {
		return empGender;
	}
	public void setEmpGender(String empGender) {
		this.empGender = empGender;
	}
	public String getWorklocation() {
		return worklocation;
	}
	public void setWorklocation(String worklocation) {
		this.worklocation = worklocation;
	}
	public String getCuurentLocation() {
		return cuurentLocation;
	}
	public void setCuurentLocation(String cuurentLocation) {
		this.cuurentLocation = cuurentLocation;
	}
	public Date getJoindate() {
		return joindate;
	}
	public void setJoindate(Date joindate) {
		this.joindate = joindate;
	}

	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", empname=" + empname + ", empdep=" + empdep + ", empGender=" + empGender
				+ ", worklocation=" + worklocation + ", cuurentLocation=" + cuurentLocation + ", joindate=" + joindate
				+ "]";
	}
	
	
	
}
