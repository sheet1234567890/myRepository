package com.adda.app.ErrorHandler;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.adda.app.CustomExceptionClass.MyCostomException;
import com.adda.app.CustomMassege.MyCustomErrorMsg;

@RestControllerAdvice
public class HandleSheetExceptionMassege {
	@ExceptionHandler(MyCostomException.class)
	public ResponseEntity<MyCustomErrorMsg> sheetCustomMsg(MyCostomException m)
	{
		return new ResponseEntity<MyCustomErrorMsg>(new MyCustomErrorMsg(new Date().toString(), 500, "sorrry Product not found ", m.getMessage()),HttpStatus.INTERNAL_SERVER_ERROR);
	}

}
