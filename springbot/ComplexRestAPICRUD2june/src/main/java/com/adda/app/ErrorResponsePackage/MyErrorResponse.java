package com.adda.app.ErrorResponsePackage;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MyErrorResponse {

	
	private String date;
	private String Status;
	private Integer code;
	private String msg;
}
