package com.adda.app.Entity;

public class Attandance {

	
	private Integer aid;
	private Integer eid;
	private String month;
	private Integer dayOfMonth;
	private Integer presentdays;
	private Double salary;
	private Double performanceofmonth;
	public Attandance() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Attandance [aid=" + aid + ", eid=" + eid + ", month=" + month + ", dayOfMonth=" + dayOfMonth
				+ ", presentdays=" + presentdays + ", salary=" + salary + ", performanceofmonth=" + performanceofmonth
				+ "]";
	}
	public Integer getAid() {
		return aid;
	}
	public void setAid(Integer aid) {
		this.aid = aid;
	}
	public Integer getEid() {
		return eid;
	}
	public void setEid(Integer eid) {
		this.eid = eid;
	}
	public String getMonth() {
		return month;
	}
	public void setMonth(String month) {
		this.month = month;
	}
	public Integer getDayOfMonth() {
		return dayOfMonth;
	}
	public void setDayOfMonth(Integer dayOfMonth) {
		this.dayOfMonth = dayOfMonth;
	}
	public Integer getPresentdays() {
		return presentdays;
	}
	public void setPresentdays(Integer presentdays) {
		this.presentdays = presentdays;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	public Double getPerformanceofmonth() {
		return performanceofmonth;
	}
	public void setPerformanceofmonth(Double performanceofmonth) {
		this.performanceofmonth = performanceofmonth;
	}
	
	
	
}
