package com.adda.app.Entity;

import java.util.List;
import java.util.Map;

import javax.persistence.CascadeType;
import javax.persistence.CollectionTable;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapKeyColumn;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer eid;
	private String ename;
	private Double esal;
	@ElementCollection
	@CollectionTable(name="project_table" ,joinColumns= @JoinColumn(name="eidfk"))
	private List<String> project;
	@ElementCollection
	@CollectionTable(name="code_table",joinColumns=@JoinColumn(name="eidfk"))
	@MapKeyColumn(name="codeno")
	private Map<String , Integer> code;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="aidfk")
	private Address address;
}
