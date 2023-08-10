package com.dollop.adda.util;

import com.dollop.adda.entity.StockInfo;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonUtil {

	public static StockInfo convertToObject(String message) {
	
		try {
			return new ObjectMapper().readValue(message, StockInfo.class);
		} catch (JsonProcessingException e) {
			
			e.printStackTrace();
			return null;
		} 
	}

	public static String convertToString(StockInfo info )
	{
		try {
			return new ObjectMapper().writeValueAsString(info);
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
}
