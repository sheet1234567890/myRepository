package com.adda.app.bean;

public class ExcelExportService {
 private String fileName;
 private String mode;                             //xml configuration.....from sir...
public ExcelExportService() {
	super();
	System.out.println("From Constructure");
	// TODO Auto-generated constructor stub
}
public String getFileName() {
	return fileName;
}
public void setFileName(String fileName) {
	this.fileName = fileName;
}
public String getMode() {
	return mode;
}
public void setMode(String mode) {
	this.mode = mode;
}
public void setup() 
{
	 System.out.println("From init method");
}
public void clean() {
	 System.out.println("From destroy method");
}
public void destroy() throws Exception {
	// TODO Auto-generated method stub
	
}
@Override
public String toString() {
	return "ExcelExportService [fileName=" + fileName + ", mode=" + mode + "]";
}
}
