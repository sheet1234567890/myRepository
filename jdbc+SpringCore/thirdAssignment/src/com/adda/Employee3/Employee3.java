package com.adda.Employee3;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import com.adda.DAO.impl.Emp3interfaceimpl;
import com.adda.DAO3.Emp3interface;

public class Employee3 {
       public void filter() 
       {
    	  Scanner s = new Scanner(System.in);
    	  System.out.println("Enter e_name");
    	  String e_name=s.nextLine();
    	  System.out.println("Enter e_email");
    	  String e_email=s.nextLine();
    	  System.out.println("Enter e_location");
    	  String e_location =  s.nextLine();
    	  Emp3interface e = new Emp3interfaceimpl();
    	  try {
			List l=e.Empfilter(e_name,e_email,e_location);
			System.out.println(l);
			
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
    	  
       }
       public void empProcedure() throws SQLException 
       {
    	   Scanner s = new Scanner(System.in);
    	   System.out.println("Enter id.....");
    	   Integer e_id=s.nextInt();
    	   Emp3interface e = new Emp3interfaceimpl();
    	   List l= e.Empprocedure(e_id);
    	   System.out.println(l);
       }
       
	public static void main(String[] args) throws SQLException{
		// TODO Auto-generated method stub
		
		Emp3interface e = new Emp3interfaceimpl();
		Employee3 e1 = new Employee3();
		//e1.filter();
		e1.empProcedure();
		
	
	}

}
