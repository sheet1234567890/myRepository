package com.adda.app.Entity;

import java.util.List;
import java.util.Map;

import javax.persistence.CascadeType;
import javax.persistence.CollectionTable;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapKeyColumn;

import org.hibernate.annotations.Cascade;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Student {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer sid;
	private String sname;
	private String sgen;
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="cidfk")
	private Course course;
	@ElementCollection
	@CollectionTable(name="languageTable" ,joinColumns = @JoinColumn(name="sidfk"))
	private List<String>language;
	@ElementCollection
	@CollectionTable(name="quali_table",joinColumns = @JoinColumn(name="sidfk"))
	@MapKeyColumn(name="categary")
	@Cascade(org.hibernate.annotations.CascadeType.ALL)
	private Map<String,Double>qualification;
}
