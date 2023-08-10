package com.adda.app.Entity;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Builder
public class Photos {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer photoid;
	private String phototitle;
	private String type;
	private String photourl;
	@Lob
	private byte[] imageData;
	private String thumbnail_url;
	@CreationTimestamp
	private Timestamp createdAt;
    @UpdateTimestamp
	private Timestamp updatedAt;
	private String createdBy;
	private String updatedBy;
	// @JsonIgnore
	// @JsonIgnoreProperties("photo")
	@ManyToOne
	@JoinColumn(name="albumidfk")
	private Album album;
	
}
