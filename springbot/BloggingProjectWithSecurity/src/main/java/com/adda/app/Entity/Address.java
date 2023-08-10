package com.adda.app.Entity;

import java.sql.Timestamp;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Address {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer addressid;
	private String Street;
	private String suite;
	private String city;
	private String zipcode;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="geoidfk")
	private Geo geo;
	@CreationTimestamp
	private Timestamp createdAt;
    @UpdateTimestamp
	private Timestamp updatedAt;
	private String createdBy;
	private String updatedBy;

}
