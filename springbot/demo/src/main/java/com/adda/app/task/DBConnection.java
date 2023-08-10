package com.adda.app.task;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component("ob")
public class DBConnection {
  @Value("${my.db.driver}")	
  private String driver;
  @Value("${my.db.url}")
  private String url;
  @Value("${my.db.user}")
  private String user;
  @Value("${my.db.password}")
  private String password;
public DBConnection() {
	super();
	// TODO Auto-generated constructor stub
}
public String getDriver() {
	return driver;
}
public void setDriver(String driver) {
	this.driver = driver;
}
public String getUrl() {
	return url;
}
public void setUrl(String url) {
	this.url = url;
}
public String getUser() {
	return user;
}
public void setUser(String user) {
	this.user = user;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
@Override
public String toString() {
	return "DBConnection [driver=" + driver + ", url=" + url + ", user=" + user + ", password=" + password + "]";
}
}
