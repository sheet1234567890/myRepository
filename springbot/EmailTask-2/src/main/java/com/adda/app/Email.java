package com.adda.app;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
//@Data
@Setter 
@Getter
@AllArgsConstructor
@NoArgsConstructor
@RequiredArgsConstructor
@Component
public class Email {
	@NonNull
	@Value("sheetal patidar")
 private String name;
	@NonNull
	@Value("100")
 private Integer id;
	private String LName;
	
}
