package com.adda.app.bean;

import java.awt.print.Book;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="oneToManyStudent")
public class Studentonetomany {
    @Id
	private Integer sid;
	private String sname;
	@OneToMany
	@JoinColumn(name="sidFk")
	private Set<Bookonetomany>b;
}
