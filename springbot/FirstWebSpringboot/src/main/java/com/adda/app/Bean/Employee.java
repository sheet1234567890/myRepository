package com.adda.app.Bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {

	private Integer empId;
	private String empName;
	private Double empSal;
	
	private String empPwd;
	private String empDept;
	private String empAddr;
}
