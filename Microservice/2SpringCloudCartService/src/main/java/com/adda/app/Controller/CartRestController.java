package com.adda.app.Controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
@RequestMapping("/v1/api/cart")
public class CartRestController {
  
	
	/**for Discovery client*/
//	@GetMapping("/show")
//	public ResponseEntity<String>firstApi()
//	{
//		return  ResponseEntity.ok("hello sheetal");
//	}
	
	/**for load Balancer*/
	@Value("${server.port}")
	private String port;
	@Value("${my.config}")
	private String title;
	
	@GetMapping("/show")
	public ResponseEntity<String>firstApi()
	{
		return  ResponseEntity.ok("hello sheetal"+port+" "+title);
	}
}
