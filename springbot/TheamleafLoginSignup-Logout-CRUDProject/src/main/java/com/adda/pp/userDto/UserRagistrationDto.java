package com.adda.pp.userDto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserRagistrationDto {

	
	private String fname;
	private String lname;
	private String email;
	private String password;
	
}
