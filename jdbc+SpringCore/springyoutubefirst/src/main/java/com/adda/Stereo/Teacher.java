package com.adda.Stereo;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class Teacher {
 private String Name;

public void setName(String name) {
	Name = name;
}

@Override
public String toString() {
	return "Teacher [Name=" + Name + "]";
}
}
