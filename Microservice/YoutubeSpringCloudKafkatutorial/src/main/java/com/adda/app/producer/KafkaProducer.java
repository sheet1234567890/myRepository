package com.adda.app.producer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaProducer {

  private KafkaTemplate<String, String> kafkatemplet;
  private static final Logger LOGGER=LoggerFactory.getLogger(KafkaProducer.class);
  
  public KafkaProducer(KafkaTemplate<String, String> kafkatemplet) 
  {
	  super();
	  this.kafkatemplet = kafkatemplet;
  }
  public void sendMsg(String msg) 
  {
	  LOGGER.info("msg sent.......%s",msg);
	 
	  kafkatemplet.send("javaguides", msg);  
  }
	
}
