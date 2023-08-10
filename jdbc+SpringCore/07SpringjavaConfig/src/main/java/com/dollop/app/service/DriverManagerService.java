package com.dollop.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.dolop1.app.bean.DriverManager;
@Component("dbs")

public class DriverManagerService {
@Autowired
//@Qualifier("m1")
  private DriverManager m1;

@Override
public String toString() {
	return "DriverManagerService [dob=" + m1 + "]";
}
 
}
