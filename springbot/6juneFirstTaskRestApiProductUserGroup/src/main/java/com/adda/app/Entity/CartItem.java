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
public class CartItem {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer cartitemid;
	@JoinColumn(name="pidfk")
    @ManyToOne
	private Product product;
	@ManyToOne
	@JoinColumn(name="gvidfk")
	private GroupVarient gvarient;
	@ManyToOne
	@JoinColumn(name="cartidfk")
	private Cart cart;
	private Integer itemQuntity;
}
