package com.adda.app.Bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Cart {

	private Integer cartid;
	private String cartCode;
	private Double cartCost;
}
