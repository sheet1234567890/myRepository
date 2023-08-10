package com.adda.app.Service;

import java.util.List;

import com.adda.app.Entity.Cart;
import com.adda.app.Entity.CartItem;

public interface cartService {

	
	public Cart createCart(Cart cart);
	public Cart viewCart(Integer id);
	public void deleteCartItem(Integer cid,Integer pid);
	public CartItem increaseQuantity(Integer quan,Integer id);
	public Cart listCartItemFromCartId(Integer cartId);
	
}
