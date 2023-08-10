package com.adda.app.bean;

public class Teacher {
     private Integer T_id;
     private String T_name;
     private String T_Subject;
     private String T_Dep;
	public Teacher() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Integer getT_id() {
		return T_id;
	}
	public void setT_id(Integer t_id) {
		T_id = t_id;
	}
	public String getT_name() {
		return T_name;
	}
	public void setT_name(String t_name) {
		T_name = t_name;
	}
	public String getT_Subject() {
		return T_Subject;
	}
	public void setT_Subject(String t_Subject) {
		T_Subject = t_Subject;
	}
	public String getT_Dep() {
		return T_Dep;
	}
	public void setT_Dep(String t_Dep) {
		T_Dep = t_Dep;
	}
	@Override
	public String toString() {
		return "Teacher [T_id=" + T_id + ", T_name=" + T_name + ", T_Subject=" + T_Subject + ", T_Dep=" + T_Dep + "]";
	}
	
}
