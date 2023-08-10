package com.adda.app.Bean;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor

public class Product {
	@Id
 private Integer pid;
 private Integer pcode;
 @ManyToOne
 @JoinColumn(name="vidfk")
 private Vender v;
}
