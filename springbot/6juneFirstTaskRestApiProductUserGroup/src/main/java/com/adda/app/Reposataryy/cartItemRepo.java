package com.adda.app.Reposataryy;

import org.springframework.data.jpa.repository.JpaRepository;

import com.adda.app.Entity.Cart;
import com.adda.app.Entity.CartItem;
import com.adda.app.Entity.Product;

public interface cartItemRepo extends JpaRepository<CartItem, Integer> {

	
	public CartItem findByProductAndCart(Product p ,Cart c);
}
