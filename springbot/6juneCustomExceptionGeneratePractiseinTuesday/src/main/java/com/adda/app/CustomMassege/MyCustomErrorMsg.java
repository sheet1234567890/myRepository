package com.adda.app.CustomMassege;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MyCustomErrorMsg {

	
	private String Date;
	private Integer Code;
	private String status;
	private String msg;
}
