package com.adda.app.MyDuplicateEmailException;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ExceptionErrorMsg {

	private String Date;
	private Integer Code;
	private String status;
	private String msg;
}
