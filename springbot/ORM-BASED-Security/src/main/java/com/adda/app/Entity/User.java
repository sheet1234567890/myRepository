package com.adda.app.Entity;

import java.util.Set;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="user")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="uid")
	private Integer userId;
	@Column(name="uname")
	private String userName;
	@Column(name="uemail")
	private String userEmail;
	@Column(name="upassword")
	private String userPassword;
	@Column(name="urole")
	@ElementCollection(fetch = FetchType.EAGER)
	@CollectionTable(name="roles_tab",joinColumns = @JoinColumn(name="uid"))
	private Set<String>userRoles;
	
}
