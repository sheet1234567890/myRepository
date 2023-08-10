package com.dollop.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.dollop.app.service.IProcess;

public class Format {

	
	 @Autowired
	 //@Autowired(required=false)                                       //jb ek bhi bean n bna ho tb k liye taki nosuchbean exception n aaye..
   // @Qualifier("advProcessImpl")            
      private IProcess advProcessImpl; 
	 @Value("#{4+5}")                          //Expression solve..Primitive value...
	 private String data1;
	 @Value("#{new java.util.Random().nextInt()}")    //
	 private String data2;                                                                      //negetive me aayega....
	 @Value("#{T(java.lang.Math).abs(new java.util.Random().nextInt())}")     //static method calll by @value               //positive me aayega....
	 private String data3;
	 @Value("#{'Sheetal'.length()}")
	 private String data4;
	 @Value("#{'Sheetal'.length>7?true:false}")
	 private String data5;
	 @Value("#{T(java.lang.Math).sqrt(256)}")          //Static method calling
	 private double data6;
	 @Value("#{T(java.lang.Math).PI}")                   //static variable  calling
	 private double data7;
	 @Value("#{T(java.lang.Math).E}")                    //static variable calling 
	 private double data8;
	 @Value("#{T(java.lang.Math).pow(2,3)}")
	 private double data9;
	 @Value("#{T(java.lang.Math).tan(45) }")
	 private double data10;
	 @Value("#{new java.lang.String('sheetal patidar')}")        //object calling 
	 private String Name;
	 @Value("#{8>2}")
	 private boolean isActive;
	 public void printFormat() {
		 advProcessImpl.getProcessCode();
		 System.out.println("printformat");
	 }
	@Override
	public String toString() {
		return "Format [advProcessImpl=" + advProcessImpl+ ", data1=" + data1 + ", data2=" + data2 + ", data3=" + data3
				+ ", data4=" + data4 + ", data5=" + data5 + ", data6=" + data6 + ", data7=" + data7 + ", data8=" + data8
				+ ", data9=" + data9 + ", data10=" + data10 + ", Name=" + Name + ", isActive=" + isActive + "]";
	}
	

}
