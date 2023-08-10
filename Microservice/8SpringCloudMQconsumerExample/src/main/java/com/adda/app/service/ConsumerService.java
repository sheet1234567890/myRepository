package com.adda.app.service;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class ConsumerService {
	/**read msg*/
	@JmsListener(destination = "${my.app.dest-name}")
	public void readMessage(String msg) 
	{
		System.out.println(msg);
	}

}
