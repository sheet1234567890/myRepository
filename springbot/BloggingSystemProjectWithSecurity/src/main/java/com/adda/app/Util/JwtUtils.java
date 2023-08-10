package com.adda.app.Util;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

@Component
public class JwtUtils {
    @Value("${app.secret}")
	private String secret;
    
    public String getUserName(String token) 
    {
    	return getClaims(token).getSubject();
    }
    
    /**tokenGenerate Public Methode*/
    public String generateToken(String Subject) 
    {
    	Map<String,Object>claims=new HashMap<>();
    	return generateToken(claims,Subject);
    }
    
  
    
    /**Claims....*/
    private Claims getClaims(String token) 
    {
    	return Jwts.parser().setSigningKey(secret.getBytes())
    			.parseClaimsJws(token).getBody();
    }
    /** Private Generate Token */
    
    private String generateToken(Map<String,Object> claims,String subject) 
    {
     return Jwts.builder()
    		 .setClaims(claims)
    		 .setSubject(subject)
    		 .setIssuer("sheetal")
    		 .setIssuedAt(new Date(System.currentTimeMillis()))
    		 .setExpiration(new Date(System.currentTimeMillis()+TimeUnit.MINUTES.toMillis(100)))
    		 .signWith(SignatureAlgorithm.HS256, secret.getBytes()).compact();
    }
    
}
