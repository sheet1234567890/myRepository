package com.adda.app.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.adda.app.FeignClientt.CartConsumerFeign;
import com.adda.app.consumer.CartConsumer;

@RestController
@RequestMapping("/order")
public class OrderRestController {
//    @Autowired
//	private CartConsumer consumer;
//    
    @Autowired
    private CartConsumerFeign consumerfeign;
	
	@GetMapping
    public ResponseEntity<String>placeOrder()
    {
    	String cartResp=consumerfeign.firstApi().getBody();
    	return ResponseEntity.ok("Order Placed With=>"+cartResp);
    }
}
