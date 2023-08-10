package com.adda.app.Emp;

import java.sql.SQLException;
import java.util.Scanner;

import com.adda.app.DAO.IEmpW_Cinterface;
import com.adda.app.DAO.impl.IEmpW_Cinterfaceimpl;

public class Emp {

	public void worklocationEmployeeList() throws SQLException 
	{
		Scanner s = new Scanner(System.in);
		IEmpW_Cinterface c = new IEmpW_Cinterfaceimpl();
		System.out.println("Enter locations name you want to detaile of employee");
		String location1 = s.nextLine();
		System.out.println("second location");
		String location2 = s.nextLine();
		System.out.println( c.workLocation2(location1, location2));		
	}
	
	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		IEmpW_Cinterface c = new IEmpW_Cinterfaceimpl();
		//c.joinDate("20220101", "20220404");
	   Emp e = new Emp();
	   //e.worklocationEmployeeList();
	   System.out.println(c.clWorkLocation());	
	}

}
