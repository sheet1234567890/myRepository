package com.adda.app.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.adda.app.Entity.OrderForProduct;
import com.adda.app.Service.OrderService;

@RestController
@RequestMapping("/order")
public class OrderController {
	@Autowired
	private OrderService oservice;
	@GetMapping("listOfOrder")
	public ResponseEntity<List<OrderForProduct>>orderList()
	{
		return new ResponseEntity<List<OrderForProduct>>(  oservice.listOrderForProduct(),HttpStatus.OK);
	}
	@GetMapping("/orderById/{id}")
	public ResponseEntity<OrderForProduct> viewOrderById(@PathVariable("id") Integer id) {
		return new ResponseEntity<OrderForProduct>(oservice.viewOrder(id),HttpStatus.OK);
	}
	
	@PostMapping("/updateorder/{id}")
	public ResponseEntity<OrderForProduct>updateOrder(@RequestBody OrderForProduct ofp ,@PathVariable("id") Integer id)
	{
		System.out.println(ofp+"  "+id);
		return new ResponseEntity<OrderForProduct>(oservice.updateOrder(ofp, id),HttpStatus.OK);
	}

}
