package com.adda.app.Entity;

public class Salary {

	
	private Integer sid;
	private Integer eid;
	private Double empbasics;
	private Double empnetSalary;
	public Salary() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Salary [sid=" + sid + ", eid=" + eid + ", empbasics=" + empbasics + ", empnetSalary=" + empnetSalary
				+ "]";
	}
	public Integer getSid() {
		return sid;
	}
	public void setSid(Integer sid) {
		this.sid = sid;
	}
	public Integer getEid() {
		return eid;
	}
	public void setEid(Integer eid) {
		this.eid = eid;
	}
	public Double getEmpbasics() {
		return empbasics;
	}
	public void setEmpbasics(Double empbasics) {
		this.empbasics = empbasics;
	}
	public Double getEmpnetSalary() {
		return empnetSalary;
	}
	public void setEmpnetSalary(Double empnetSalary) {
		this.empnetSalary = empnetSalary;
	}
	
	
}
