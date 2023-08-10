package com.adda.app.Bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Model {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer mId;
	private String mCode;
	private String mData;

}

