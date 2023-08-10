package com.adda.app.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class OrderForProduct {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer oid;
	private String address;
	private String city;
	private String status;
	private String Comments;
	private Double totalPrice;
	private Integer pincode;
	
	
	
}
