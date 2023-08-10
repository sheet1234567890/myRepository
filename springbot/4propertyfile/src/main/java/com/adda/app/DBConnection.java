package com.adda.app;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.stereotype.Component;

import lombok.Data;
@Component("ob")
@Data
@ConfigurationProperties("my.dbb")
public class DBConnection {
	 
	  private String driver;
	  private String url;
	  private String user;
	  private String password;

}
