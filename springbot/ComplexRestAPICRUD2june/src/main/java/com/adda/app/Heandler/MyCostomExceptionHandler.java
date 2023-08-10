package com.adda.app.Heandler;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.adda.app.ErrorResponsePackage.MyErrorResponse;
import com.adda.app.Exception123.EmployeeNotFoundException;

@RestControllerAdvice
public class MyCostomExceptionHandler {

	//For Error Msg.............
	
//	@ExceptionHandler(EmployeeNotFoundException.class)
//	public ResponseEntity<String> showCustomErrorMsg(EmployeeNotFoundException enfe)
//	{
//		return new ResponseEntity<String>(enfe.getMessage(),HttpStatus.INTERNAL_SERVER_ERROR);
//	}
	
	
	//For ResponseError Msg With Response Code
	
	@ExceptionHandler(EmployeeNotFoundException.class)
	public ResponseEntity<MyErrorResponse> showCustomErrorMsg(EmployeeNotFoundException enfe)
	{
	return new ResponseEntity<MyErrorResponse>(new MyErrorResponse(new Date().toString(), "Exception in Process", 500, enfe.getMessage()),HttpStatus.INTERNAL_SERVER_ERROR);
	}
 }
