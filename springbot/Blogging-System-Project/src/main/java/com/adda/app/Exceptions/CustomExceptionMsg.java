package com.adda.app.Exceptions;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CustomExceptionMsg {

	
	private String Date;
	private Integer Code;
	private String status;
	private String msg;
}
