package com.adda.app.Bean;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Table
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Employee {
    @Id
	private Integer eid;
	private String ename;
	private Double eSal;
	@ManyToOne
	@JoinColumn(name="did")
	private Department dep;
}
