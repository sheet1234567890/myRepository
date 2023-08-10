package com.dollop.adda.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.dollop.adda.db.MessageStore;
import com.dollop.adda.entity.StockInfo;
import com.dollop.adda.service.ProducerService;
import com.dollop.adda.util.JsonUtil;



@RestController
@RequestMapping("/api/v1/kafka")
public class StockRestController {

	@Autowired
	private ProducerService service;
	@Autowired
	private MessageStore store;
	
	@GetMapping("/send")
	public String readMessage(@RequestParam String code,@RequestParam Double cost)
	{
		StockInfo info = new  StockInfo();
		info.setSCode(code);
		info.setSCost(cost);
		
		String message =JsonUtil.convertToString(info);
		service.sendMessage(message);
		return "SENT";
	}
	
	@GetMapping("/all")
	public List<StockInfo> fetchAll()
	{
		return store.getAll();
	}
	
}
