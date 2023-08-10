package com.adda.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

@Component
public class ProducerService {
	@Autowired
	private JmsTemplate jt;
	@Value("${my.app.dest-name}")
	private String destination;
	
	public void sendMsg(String msg) 
	{
		jt.send(destination, session->session.createTextMessage(msg));
		System.out.println("msg send"+msg);
	}

}