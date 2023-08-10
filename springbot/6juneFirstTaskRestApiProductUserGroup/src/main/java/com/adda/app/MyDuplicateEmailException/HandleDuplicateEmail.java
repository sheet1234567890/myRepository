package com.adda.app.MyDuplicateEmailException;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;



@RestControllerAdvice
public class HandleDuplicateEmail {
 @ExceptionHandler(DuplicateEmail.class)
	public ResponseEntity<ExceptionErrorMsg>DuplicateCustomMsg(DuplicateEmail de)
	{
		return new ResponseEntity<ExceptionErrorMsg>(new ExceptionErrorMsg(new Date().toString(),500,"Email Already Exist..plz enter other email",de.getMessage()),HttpStatus.INTERNAL_SERVER_ERROR);
	}
 @ExceptionHandler(ProductNotFound.class)
    public ResponseEntity<ExceptionErrorMsg>ProductNotFoundCustomMsg(ProductNotFound pnf)
    {
    	return new ResponseEntity<ExceptionErrorMsg>(new ExceptionErrorMsg(new Date().toString(),500,"product not found",pnf.getMessage()),HttpStatus.INTERNAL_SERVER_ERROR);
    }
 @ExceptionHandler(UserNotFound.class)
	public ResponseEntity<ExceptionErrorMsg>UserNotFoundCustomException(UserNotFound u)
	{
	   return new ResponseEntity<ExceptionErrorMsg>(new ExceptionErrorMsg(new Date().toString(),500,"User Not Found",u.getMessage()),HttpStatus.INTERNAL_SERVER_ERROR);
	
	}
 @ExceptionHandler(GroupNotFound.class)
	public ResponseEntity<ExceptionErrorMsg>GroupNotFoundCustomException(GroupNotFound u)
	{
	   return new ResponseEntity<ExceptionErrorMsg>(new ExceptionErrorMsg(new Date().toString(),500,"Group Not Found",u.getMessage()),HttpStatus.INTERNAL_SERVER_ERROR);
	
	}
}
