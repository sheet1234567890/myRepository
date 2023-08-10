package com.adda.app.Entity;

import java.sql.Timestamp;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Data
public class Album {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer albumid;
	private String albumtitle;
	@CreationTimestamp
	private Timestamp createdAt;
    @UpdateTimestamp
	private Timestamp updatedAt;
	private String createdBy;
	private String updatedBy;
	//@JsonIgnore
    @ManyToOne
	@JoinColumn(name="uidfk")
	private User user;
   // @JsonIgnore
 	@JsonIgnoreProperties("album")
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name="albumidfk")
    private List<Photos> photo;
}	