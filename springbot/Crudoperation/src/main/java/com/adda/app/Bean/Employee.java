package com.adda.app.Bean;

import javax.persistence.Entity;
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
	 private Integer eid;
	 private String ename;
	 private Integer esal;
	 private String edep;
}
