package com.dollop.app.Test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.expression.Expression;
import org.springframework.expression.spel.standard.SpelExpressionParser;

import com.dollop.app.config.myappConfig;
import com.dollop.app.controller.Format;

public class FormatTest {

	public static void main(String[] args) {
		// TODO Auto-genermethod stub
		 ApplicationContext ac = new AnnotationConfigApplicationContext(myappConfig.class);
		  Format fob=ac.getBean("format",Format.class);
		  fob.printFormat();
		  
		  SpelExpressionParser t = new SpelExpressionParser();
		  Expression e = t.parseExpression("11+22");
		  System.out.println(e.getValue());
	}

}
