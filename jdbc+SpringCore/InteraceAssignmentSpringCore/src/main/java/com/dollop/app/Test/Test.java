package com.dollop.app.Test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.expression.Expression;
import org.springframework.expression.spel.standard.SpelExpressionParser;

import com.dollop.app.config.myappConfig;
import com.dollop.app.controller.Format;

public class Test {
	public static void main(String[]args) {
  ApplicationContext ac = new AnnotationConfigApplicationContext(myappConfig.class);
  /*ProductReportService pob = ac.getBean("ob",ProductReportService.class);
  pob.generateReports();*/
  
  
  
}
}