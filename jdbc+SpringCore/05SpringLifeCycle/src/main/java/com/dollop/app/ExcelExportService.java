package com.dollop.app;
                                        //Anotation wala...................
public class ExcelExportService {
   private String fileName;
   private String mode;
public ExcelExportService() {
	super();
	System.out.println("From constructor");
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

public void setUp() 
{
 System.out.println("setup method");	
}

public void clean() {
	System.out.println("clean method");
}
@Override
public String toString() {
	return "ExcelExportService [fileName=" + fileName + ", mode=" + mode + "]";
}
}
