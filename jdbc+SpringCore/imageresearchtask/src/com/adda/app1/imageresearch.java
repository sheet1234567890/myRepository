package com.adda.app1;

import java.io.InputStream;
import java.sql.Blob;

public class imageresearch {
 private String name;
 private InputStream blob;
public imageresearch() {
	super();
	// TODO Auto-generated constructor stub
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public InputStream getBlob() {
	return blob;
}
public void setBlob(InputStream blob) {
	this.blob = blob;
}
@Override
public String toString() {
	return "imageresearch [name=" + name + ", blob=" + blob + "]";
}

 
}
