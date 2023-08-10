package com.adda.app.Bean;

import javax.persistence.Entity;
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
@Table(name="LeftJointableProduct")
public class Product {
private Integer pid;
private String pcode;
@ManyToOne
@JoinColumn(name="vidfk")
private Vender vid;
}
