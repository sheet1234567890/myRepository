package com.adda.app.Test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.adda.app.bean.ExcelExportService;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
		  ExcelExportService eob=ac.getBean("eob",ExcelExportService.class);
		  System.out.println(eob);
		  ac.close();
	}
}
