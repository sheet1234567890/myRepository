package com.adda.app.util;

import com.adda.app.Entity.StockInfo;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class jsonUtil {

	
	public static StockInfo convertToObject(String msg) 
	{
		try {
			return new ObjectMapper().readValue(msg, StockInfo.class);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null; 
		}
	
	}
	
	public static String convertObjectToString( StockInfo info) 
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
