package com.adda.app.bean;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="oneToManyBook")
public class Bookonetomany {
     @Id
	 private Integer bid;
	 private String bname;
}
