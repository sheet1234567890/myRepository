package com.adda.app.Runner;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.adda.app.service.ProducerService;
@Component
public class TestSenderRunner  {
   @Autowired
	private ProducerService service;

   @Scheduled(cron="*/5 * * * * *")
    public void sendmsg() {
    	service.sendMsg("hey sheetal....."+new Date());
	
	}

}
