package com.dollop.app.controller;

import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
@Component("ob")
public class ProductReportService {
	//@Scheduled(fixedDelay = 2000)
	//@Scheduled(fixedRate = 2000)
	//@Scheduled(cron = "0 0 9 * * *")     //execute task every day at 9:00:00 AM
	 //@Scheduled(cron="0 0 18 * * *")       //excecute task every day 6:00 PM
	//@Scheduled(cron="0 0 9 10 * *")          //excecute task every month 10th date on 9 AM
	//@Scheduled(cron="0 30 * * * *")            //excecute task on every hours 30th min(not thirty min gap)
	//@Scheduled(cron="10 * * * * *")              //per minit 10th second
	//@Scheduled(cron="*/10 * * * * *")             //per 10 second
	//@Scheduled(cron ="0 0 9 10 * *")              //every month 9 pM
  public void generateReports() 
  {
	  System.out.println("hello "+ new Date());
  }
}
