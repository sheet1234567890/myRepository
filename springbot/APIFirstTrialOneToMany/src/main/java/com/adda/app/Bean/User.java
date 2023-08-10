package com.adda.app.Bean;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
@Entity
public class User {
     @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer uid;
	private String uname;
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="ridfk")
	private Role role;
}
