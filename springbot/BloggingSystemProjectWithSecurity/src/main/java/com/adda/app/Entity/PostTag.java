package com.adda.app.Entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class PostTag {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer postTagid;
	@ManyToOne
	@JoinColumn(name="postidfk")
	private Post post;
	
	@ManyToOne
	@JoinColumn(name="tagidfk")
	private Tag tag;
}
