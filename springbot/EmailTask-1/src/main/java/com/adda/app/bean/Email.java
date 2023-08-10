package com.adda.app.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;
@Component("ob")
@Data
public class Email {
	@Value("sheetal patidar")
 private String name;
	@Value("100")
 private Integer id;
	
}
