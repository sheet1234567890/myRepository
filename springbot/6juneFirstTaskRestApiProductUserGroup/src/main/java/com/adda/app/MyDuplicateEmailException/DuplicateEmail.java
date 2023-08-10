package com.adda.app.MyDuplicateEmailException;

public class DuplicateEmail extends RuntimeException {

	public DuplicateEmail()  {
		super();
		
	}

	public DuplicateEmail(String message) {
		super(message);
		
	}

}
