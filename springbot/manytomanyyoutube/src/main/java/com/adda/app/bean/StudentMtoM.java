package com.adda.app.bean;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class StudentMtoM {
@Id
	private Integer sid;
	private String sname;
	@ManyToMany
	@JoinTable(name="stbktab",joinColumns=@JoinColumn(name="sidfk"),inverseJoinColumns=@JoinColumn(name="bidfk"))
	private Set<BookMtoM>list;
}
