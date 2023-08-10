package com.adda.app.Bean;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Data;

@Data
@Entity
@Table(name="stdtab")
public class Student {
	@Id
	@Column(name="sid")
	@GeneratedValue(strategy = GenerationType.AUTO)                            //AUTO KI JAGAH PR IDENTITY BH KR SKTE H
 private Integer stdid;
	@Column(name="sname")
 private String stdname;
	@Column(name="sfee")
 private  Double stdFee;
	@Column(name="sdoj")
	@Temporal(TemporalType.TIMESTAMP)
 private Date stdDoj;
	
  
}
