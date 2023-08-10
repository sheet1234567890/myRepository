package com.adda.app.Exception123;

public class EmployeeNotFoundException extends RuntimeException {

	public  EmployeeNotFoundException() 
	{
		super();
	}
	
	public EmployeeNotFoundException(String msg) 
	{
		super(msg);
	}
	
}
