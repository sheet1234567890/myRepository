package com.adda.app.Bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Employee {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer  emp_id;
	private String emap_name;
	private Double emp_sal;
	private String emp_pwd;
	private String emp_dept;
	private String emp_adddress;
	public Employee(String emap_name, Double emp_sal, String emp_pwd, String emp_dept, String emp_adddress) {
		super();
		this.emap_name = emap_name;
		this.emp_sal = emp_sal;
		this.emp_pwd = emp_pwd;
		this.emp_dept = emp_dept;
		this.emp_adddress = emp_adddress;
	}
	
	
}
