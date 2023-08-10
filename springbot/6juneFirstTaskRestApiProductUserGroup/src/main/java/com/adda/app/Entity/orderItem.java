package com.adda.app.Entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class orderItem {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
 private Integer itemid;
 private Double itemprice;

 @ManyToOne(cascade = CascadeType.ALL)
 @JoinColumn(name="oidfk")
 private OrderForProduct order;
 @ManyToOne
 @JoinColumn(name="pidfk")
 private Product product;
 @JoinColumn(name="gvidfk")
 @ManyToOne
 private GroupVarient gvarient;
}
