package com.dollop.adda.db;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.dollop.adda.entity.StockInfo;
import com.dollop.adda.repo.StockInfoRepo;
import com.dollop.adda.util.JsonUtil;

@Component
public class MessageStore {

	@Autowired
	private StockInfoRepo repo;
	
	
	public void add(String message)
	{
		StockInfo stockInfo = JsonUtil.convertToObject(message);
		repo.save(stockInfo);
	}

	public List<StockInfo> getAll() {
	
		return repo.findAll();
	}
	
}
