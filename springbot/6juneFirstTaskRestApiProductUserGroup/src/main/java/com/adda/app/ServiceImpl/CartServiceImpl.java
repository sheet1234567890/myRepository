package com.adda.app.ServiceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.adda.app.Entity.Cart;
import com.adda.app.Entity.CartItem;
import com.adda.app.Entity.Product;
import com.adda.app.Reposataryy.CartRepo;
import com.adda.app.Reposataryy.cartItemRepo;
import com.adda.app.Service.cartService;
@Service
public class CartServiceImpl implements cartService {
@Autowired
	private CartRepo crepo;
@Autowired
    private cartItemRepo ctrepo; 
	@Override
	public Cart createCart(Cart cart) {
		
		return crepo.save(cart) ;
	}
	@Override
	public Cart viewCart(Integer id) {
		Optional<Cart> cart1 = crepo.findById(id);
		Cart cart2=null;
		if(cart1.isPresent()) 
		{
		  cart2= cart1.get();
		}
		return cart2;
		
	}
	@Override
	public void deleteCartItem(Integer cid, Integer pid) {
		Product p = new Product();
		Cart c = new Cart();
		p.setPid(pid);
		c.setCartId(cid);
		CartItem cc = ctrepo.findByProductAndCart(p, c);
		ctrepo.delete(cc);
	}
	@Override
	public CartItem increaseQuantity(Integer qua, Integer id) {
	Optional<CartItem> c = ctrepo.findById(id);
	CartItem c1=null ;
	if(c.isPresent()) 
	{  
		c1 = c.get();
		Integer q=c.get().getItemQuntity();
		Integer q1=q+qua;
		c1.setItemQuntity(q1);
        		
	}
	return ctrepo.save(c1);
	}
	@Override
	public Cart listCartItemFromCartId(Integer cartId) {
	 Optional<Cart>c= crepo.findById(cartId);
	 Cart cart=null;
	if(c.isPresent()) 
	{
		cart=c.get();
	}
	return cart;
	}

}
