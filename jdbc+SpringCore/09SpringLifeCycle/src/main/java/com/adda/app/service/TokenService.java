package com.adda.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.adda.app.bean.Token1;

@Component
public class TokenService {
 @Autowired
 private  Token1 token;
  public Token1 getToken() {
	  token=getNewToken();
	return token;
}

//public void setToken(Token token) {
//	this.token = token;
//}

  
  @Lookup
  public Token1 getNewToken() 
  {
	  return null;
  }
@Override
public String toString() {
	return "TokenService [token=" + token + "]";
}
 
}
