package com.adda.app.Entity;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.aspectj.internal.lang.annotation.ajcPrivileged;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import com.fasterxml.jackson.annotation.JsonBackReference;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Todos {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY )
	private Integer todoid;
	private String todotitle;
	private Boolean completed;
	@CreationTimestamp
	private Timestamp createdAt;
    @UpdateTimestamp
	private Timestamp updatedAt;
	private String createdBy;
	private String updatedBy;
	@JsonBackReference
	@ManyToOne
	@JoinColumn(name="uidfk")
	private User user;
}
