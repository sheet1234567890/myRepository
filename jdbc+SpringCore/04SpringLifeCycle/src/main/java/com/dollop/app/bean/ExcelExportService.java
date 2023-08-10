package com.dollop.app.bean;

import org.springframework.beans.factory.DisposableBean; 
import org.springframework.beans.factory.InitializingBean;
                                                                     //interface wala.................
public class ExcelExportService implements InitializingBean ,DisposableBean {
 private  String fileName;
 private String Mode;         
public ExcelExportService() {
	super();
	System.out.println("From Constructor");
	// TODO Auto-generated constructor stub
}
public String getFileName() {
	return fileName;
}
public void setFileName(String fileName) {
	this.fileName = fileName;
}
public String getMode() {
	return Mode;
}
public void setMode(String mode) {
	Mode = mode;
}


public void afterPropertiesSet() throws Exception {
	// TODO Auto-generated method stub
	System.out.println("From INIT method");
	
}
public void destroy() throws Exception {
	// TODO Auto-generated method stub
	System.out.println("From Destroy method");
	
}
@Override
public String toString() {
	return "ExcelExportService [fileName=" + fileName + ", Mode=" + Mode + "]";
}

}
