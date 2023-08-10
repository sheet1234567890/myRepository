package com.adda.app.Entity;

import java.sql.Timestamp;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer uid;
	private String fname;
	private String lname;
	@Column(unique = true)
	private String username;
	private String password;
	@Column(unique = true)
	private String email;
	@CreationTimestamp
    private Timestamp createdAt;
	@UpdateTimestamp
	private Timestamp updatedAt;
	private String phone;
	private String website;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="addressidfk")
	private Address address;
	@JsonIgnoreProperties("ulist")
	@ManyToOne
	@JoinColumn(name="companyidfk")
	private Company company;
	@JsonIgnore
	@JsonIgnoreProperties("user")
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="uidfk")
	private List<Album> album;
	@JsonIgnore
	@JsonIgnoreProperties("user")
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="uidfk")
	private List<Post>postlist; 
	@JsonIgnore
	@JsonIgnoreProperties("user")
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="uidfk")
	private List<Comments> Listofcomment;
	@JsonIgnore
	@JsonIgnoreProperties("user")
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="uidfk")
	private List<Todos>listofTodo;
	@ElementCollection(fetch = FetchType.EAGER)
	private List<String>roles;
	
	

}
