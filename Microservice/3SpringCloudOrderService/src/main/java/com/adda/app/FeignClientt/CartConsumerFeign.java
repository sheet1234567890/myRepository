package com.adda.app.FeignClientt;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("CART-SERVICE")
public interface CartConsumerFeign {

	@GetMapping("/v1/api/cart/show")
	public ResponseEntity<String>firstApi();
    
}
