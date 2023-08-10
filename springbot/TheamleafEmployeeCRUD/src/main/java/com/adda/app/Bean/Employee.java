package com.adda.app.Bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor

@Data
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="emp_id")
	private Integer  empid;
	@Column(name="emap_name")
	private String emapname;
	@Column(name="emp_sal")
	private Double empsal;
	@Column(name="emp_pwd")
	private String emppwd;
	@Column(name="emp_dept")
	private String empdept;
	@Column(name="emp_adddress")
	private String empadddress;
	
	
}
