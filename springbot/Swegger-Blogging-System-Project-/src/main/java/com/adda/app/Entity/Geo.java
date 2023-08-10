package com.adda.app.Entity;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Geo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer geoid;
	private String lat;
	private String lng;
	@CreationTimestamp
	private Timestamp createdAt;
    @UpdateTimestamp
	private Timestamp updatedAt;
	private String createdBy;
	private String updatedBy;
}
