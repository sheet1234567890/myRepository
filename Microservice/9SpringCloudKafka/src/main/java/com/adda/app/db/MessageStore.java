package com.adda.app.db;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.adda.app.Entity.StockInfo;
import com.adda.app.repo.StockInfoRepo;
import com.adda.app.util.jsonUtil;

@Component
public class MessageStore {
	@Autowired
	private StockInfoRepo srepo;

	public void add(String msg) 
	{
		StockInfo info = jsonUtil.convertToObject(msg);
		srepo.save(info);
	}
	
	public List<StockInfo> getAll()
	{
		return srepo.findAll();
	}
}
