package com.adda.app.consumer;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;


@Component
public class CartConsumer {
	
	/**Discovery client an interface provide by netflix*/
	//for Discovery Client
//    @Autowired
//	private DiscoveryClient client;
//	
//    public String getCartResponse() 
//    {
//    	List<ServiceInstance>listofServiceInstance=client.getInstances("CART-SERVICE");
//    	ServiceInstance si = listofServiceInstance.get(0);
//    	URI uri = si.getUri();
//    	String url = uri+"/v1/api/cart/show";
//    	RestTemplate rt = new RestTemplate();
//    	ResponseEntity<String>response = rt.getForEntity(url, String.class);
//    	return response.getBody();
//    	
//    }
    
	
	/**for LoadBalancer*/
	 @Autowired
		private LoadBalancerClient client;
		
	    public String getCartResponse() 
	    {
	    	ServiceInstance si =client.choose("CART-SERVICE");
	    	URI uri = si.getUri();
	    	String url = uri+"/v1/api/cart/show";
	    	System.out.println(url);
	    	RestTemplate rt = new RestTemplate();
	    	ResponseEntity<String>response = rt.getForEntity(url, String.class);
	    	return response.getBody(); 
	    	
	    }
	
	
	      
}
