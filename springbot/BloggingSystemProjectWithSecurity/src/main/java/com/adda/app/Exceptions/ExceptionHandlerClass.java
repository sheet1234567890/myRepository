package com.adda.app.Exceptions;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;



@RestControllerAdvice
public class ExceptionHandlerClass {
	@ExceptionHandler(DuplicateEntryException.class)
	public ResponseEntity<CustomExceptionMsg>DuplicateMsg(DuplicateEntryException d)
	{
		return new ResponseEntity<CustomExceptionMsg>(new CustomExceptionMsg(new Date().toString(), 500, "Exception in process....", d.getMessage()),HttpStatus.INTERNAL_SERVER_ERROR);
	}
	@ExceptionHandler(UserNotFoundException.class)
	public ResponseEntity<CustomExceptionMsg>UserNotFound(UserNotFoundException u)
	{
		return new ResponseEntity<CustomExceptionMsg>(new CustomExceptionMsg(new Date().toString(), 500, "Exception in process....", u.getMessage()),HttpStatus.INTERNAL_SERVER_ERROR);
	}
	@ExceptionHandler(DuplicateComapnyNameException.class)
	public ResponseEntity<CustomExceptionMsg>UserNotFound(DuplicateComapnyNameException u)
	{
		return new ResponseEntity<CustomExceptionMsg>(new CustomExceptionMsg(new Date().toString(), 500, "Exception in process....", u.getMessage()),HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	@ExceptionHandler(PostNotFoundException.class)
	public ResponseEntity<CustomExceptionMsg>PostNotFound(PostNotFoundException u)
	{
		return new ResponseEntity<CustomExceptionMsg>(new CustomExceptionMsg(new Date().toString(), 500, "Exception in process....", u.getMessage()),HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	@ExceptionHandler(UserRoleAlreadyExistException.class)
	public ResponseEntity<CustomExceptionMsg>CheakUserUsorExist(UserRoleAlreadyExistException u)
	{
		return new ResponseEntity<CustomExceptionMsg>(new CustomExceptionMsg(new Date().toString(), 500, "Exception in process....", u.getMessage()),HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	@ExceptionHandler(AlbumNotFoundException.class)
	public ResponseEntity<CustomExceptionMsg>CheakUserUsorExist(AlbumNotFoundException u)
	{
		return new ResponseEntity<CustomExceptionMsg>(new CustomExceptionMsg(new Date().toString(), 500, "Exception in process....", u.getMessage()),HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	@ExceptionHandler(PhotoNotFoundException.class)
	public ResponseEntity<CustomExceptionMsg>CheakUserUsorExist(PhotoNotFoundException u)
	{
		return new ResponseEntity<CustomExceptionMsg>(new CustomExceptionMsg(new Date().toString(), 500, "Exception in process....", u.getMessage()),HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	@ExceptionHandler(TodosNotFound.class)
	public ResponseEntity<CustomExceptionMsg>CheakUserUsorExist(TodosNotFound u)
	{
		return new ResponseEntity<CustomExceptionMsg>(new CustomExceptionMsg(new Date().toString(), 500, "Exception in process....", u.getMessage()),HttpStatus.INTERNAL_SERVER_ERROR);
	}
	@ExceptionHandler(CompanyNotFoundException.class)
	public ResponseEntity<CustomExceptionMsg>CheakUserUsorExist(CompanyNotFoundException u)
	{
		return new ResponseEntity<CustomExceptionMsg>(new CustomExceptionMsg(new Date().toString(), 500, "Exception in process....", u.getMessage()),HttpStatus.INTERNAL_SERVER_ERROR);
	}
	@ExceptionHandler(InvalidRoleException.class)
	public ResponseEntity<CustomExceptionMsg>InvalidRoleException(InvalidRoleException u)
	{
		return new ResponseEntity<CustomExceptionMsg>(new CustomExceptionMsg(new Date().toString(), 500, "Exception in process....", u.getMessage()),HttpStatus.INTERNAL_SERVER_ERROR);
	}

}
