package com.adda.app.Entity;

public class HikeTable {

	
	private Integer hikeid;
	private Integer empid;
	private Double performancepoint;
	private Double incrementedamount;
	private Double netsalary;
	public HikeTable() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "HikeTable [hikeid=" + hikeid + ", empid=" + empid + ", performancepoint=" + performancepoint
				+ ", incrementedamount=" + incrementedamount + ", netsalary=" + netsalary + "]";
	}
	public Integer getHikeid() {
		return hikeid;
	}
	public void setHikeid(Integer hikeid) {
		this.hikeid = hikeid;
	}
	public Integer getEmpid() {
		return empid;
	}
	public void setEmpid(Integer empid) {
		this.empid = empid;
	}
	public Double getPerformancepoint() {
		return performancepoint;
	}
	public void setPerformancepoint(Double performancepoint) {
		this.performancepoint = performancepoint;
	}
	public Double getIncrementedamount() {
		return incrementedamount;
	}
	public void setIncrementedamount(Double incrementedamount) {
		this.incrementedamount = incrementedamount;
	}
	public Double getNetsalary() {
		return netsalary;
	}
	public void setNetsalary(Double netsalary) {
		this.netsalary = netsalary;
	}
	
}
