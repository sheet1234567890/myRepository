package com.adda.app.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.adda.app.producer.KafkaProducer;

@RestController
@RequestMapping("/api/v1/kafka")
public class MsgController {

	
	private KafkaProducer kafkaProducer;
	
	
	public MsgController(KafkaProducer kafkaProducer) 
	{
		super();
		this.kafkaProducer=kafkaProducer;
	}
	
	//http:localhost:8080/api/v1/kafka/publish?message=hello world
	@GetMapping("/publish")
	public ResponseEntity<String> publish(@RequestParam("message") String message)
	{
	   kafkaProducer.sendMsg(message);
	   return ResponseEntity.ok("msg sent to the topic");
	}
}
