package com.adda.app.bean;

import java.util.Random;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Token1 {
	
public void setCode(int code) {
		Code = code;
	}

private int Code;

public Token1() {
	super();
	Code=Math.abs(new Random().nextInt());
	// TODO Auto-generated constructor stub
}

public int getCode() {
	return Code;
}

@Override
public String toString() {
	return "Token1 [Code=" + Code + "]";
}
}
