package com.adda.app.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.adda.app.Entity.Cart;
import com.adda.app.Entity.CartItem;
import com.adda.app.Entity.orderItem;
import com.adda.app.Service.cartService;
import com.adda.app.Service.orderItemservice;

@RequestMapping("/cart")
@RestController
public class Cartcontroller {
	@Autowired
  private cartService cservice;	
	@Autowired
	private orderItemservice oiservice;
	@PostMapping("/addCart")
	
	public ResponseEntity<Cart>addCart(@RequestBody Cart cart){
		return new ResponseEntity<Cart>(cservice.createCart(cart),HttpStatus.CREATED);
	}
	@GetMapping("/viewCart/{id}")
	public ResponseEntity<Cart>viewCart(@PathVariable("id") Integer id)
	{
		return new ResponseEntity<Cart>(cservice.viewCart(id),HttpStatus.OK);
	}
	@DeleteMapping("/cartitemdelete/{cid}/{pid}")
	public ResponseEntity<String> deletitemincart(@PathVariable ("cid") Integer cid,@PathVariable("pid")Integer pid)
	{   System.out.println(cid+" "+pid);
	cservice.deleteCartItem(cid, pid);
		return new ResponseEntity<String>("delete success full..",HttpStatus.OK);
	}
	@PutMapping("Quantity/{qua}/{id}")
	public ResponseEntity<CartItem>updateItemQuantity(@PathVariable("qua")Integer q,@PathVariable("id") Integer id)
	{
		System.out.println(q+"id"+id);
		return new ResponseEntity<CartItem>(cservice.increaseQuantity(q, id) ,HttpStatus.OK);
	}
	@PostMapping("/saveOrderItem")
	public ResponseEntity<orderItem>createOrderItem(@RequestBody orderItem oi)
	{
		System.out.println(oi);
		return new ResponseEntity<orderItem>(oiservice.CreateOrderItem(oi),HttpStatus.CREATED);
	}
	@GetMapping("/itemOfcart/{id}")
	public ResponseEntity<Cart>ListOfItemFromCart(@PathVariable("id") Integer id)
	{
		
		return new ResponseEntity<Cart>(cservice.listCartItemFromCartId(id),HttpStatus.CREATED);
	}
}
