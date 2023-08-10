package com.adda.app.bean;

import org.springframework.stereotype.Component;



public class Token {
   private String code;

public Token() {
	super();
	// TODO Auto-generated constructor stub
}

public String getCode() {
	return code;
}

public void setCode(String code) {
	System.out.println(",,,,,,,,,");
	this.code = code;
}

@Override
public String toString() {
	return "Token [code=" + code + "]";
}
}
