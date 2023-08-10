package com.dollop.adda.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j  // For logger
public class ProducerService {

	@Autowired
	private KafkaTemplate<String, String> kafkaTemplate;
	
	@Value("${my.topic.name}")
	private String topic;
	
	
	public void sendMessage(String message)
	{
		log.info("Message At Producer Service",message);
		kafkaTemplate.send(topic,message);
	}
	
}
