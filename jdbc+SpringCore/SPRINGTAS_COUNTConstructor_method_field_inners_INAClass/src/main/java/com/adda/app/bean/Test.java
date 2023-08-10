package com.adda.app.bean;


import java.lang.reflect.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Test {
public void sheetal() 
{
	int shee;
}
public Integer add(int a,int b) 
{
	return a+b;
}
	public static void main(String[] args) 
	{   Test t = new Test();
		// TODO Auto-generated method stub
       Class classobj = ArrayList.class;
       Constructor[] c = classobj.getConstructors();
       int countConstructor = 0;
       Method [] m = classobj.getDeclaredMethods();
       int countMethod = 0;
       Field[] f = classobj.getDeclaredFields();
       int countField=0;
       Class [] c1 = classobj.getDeclaredClasses();
       int countClass=0;
       for(Constructor con:c) 
       {
    	   ++countConstructor;
    	   System.out.println("Constructor Name:->"+con+"  Constructor parameter count:->"+con.getParameterCount());
       }
       System.out.println("Total Constructor in this Class :->"+countConstructor);
       for(Method m1:m) 
       {
    	   ++countMethod;
    	   System.out.println("Method Name:->"+m1+"  Method Arguments:->"+m1.getParameterCount());
       }
       System.out.println("Total Methods in this class :->"+countMethod);
	   for(Field f1:f) 
	   {
		   ++countField;
		   System.out.println("Field Name:->"+f1);
	   }
	   System.out.println("Total Fields in this class :->"+countField);
	   for(Class c12:c1) 
	   {
		   ++countClass;
		   System.out.println(" INNER Class Name"+c12);
	   }
	   System.out.println("Total Inner Class"+countClass);
	   System.out.println(t.add(12, 12));
	}

}
