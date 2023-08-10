//package com.adda.app.Config;
//
//import java.util.ArrayList;
//
//import springfox.documentation.service.SecurityScheme;
//import springfox.documentation.service.VendorExtension;
//
//
//
//
//public class ApiKey extends SecurityScheme {
//
//	private final String keyname;
//	private final String passAs;
//	
//	
//	public ApiKey(String name, String keyname, String passAs) {
//		this(name,keyname,passAs,new ArrayList<VendorExtension>());
//		// TODO Auto-generated constructor stub
//	}
//	
//	
//	public ApiKey(String name, String keyname, String passAs, ArrayList<VendorExtension> vendorExtension) {
//		super(name,"apiKey");
//		this.keyname=keyname;
//		this.passAs=passAs;
//		addValidVendorExtensions(vendorExtension);
//		
//	}
//	
//	
//	public String getKeyname() {
//		
//     return keyname;
//	}
//
//	
//	
//}
