package com.dollop.app.service.impl;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import com.dollop.app.service.IProcess;
@Component
@Primary
public class ProcessImpl implements IProcess {
    
	public void getProcessCode() {
		System.out.println("processImpl method getprocessCode");
	}

}
