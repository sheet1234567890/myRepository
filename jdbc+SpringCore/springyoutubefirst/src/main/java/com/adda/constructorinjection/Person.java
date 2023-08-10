package com.adda.constructorinjection;

import java.util.List;

public class Person {
  private String name;
  private int id;
  private Certi c;
  private List<String>l;
public Person(String name, int id ,Certi c ) {
	super();
	this.name = name;
	this.id = id;
	this.c=c;
	
}
@Override
public String toString() {
	return "Person [name=" + name + ", id=" + id + "]";
}

}
