package com.adda.app.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@Data
@NoArgsConstructor
public class ImageEntity {

	  @Id
	  @GeneratedValue
	  
	    private int id;
	    private String aname;
	   @Lob
	    private byte[] pic;	
	
}
