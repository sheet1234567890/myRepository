package com.adda.Emp;

import java.sql.SQLException;
import java.util.Scanner;

import com.adda.DAO.EmpDAOinterface;
import com.adda.DAO.impl.EmpDAOimpl;
import com.adda.bean.Employee;

public class Emp {
    public void InsertRecodofEmp() 
    {
    	Employee e = new Employee();
    	EmpDAOinterface Ein = new EmpDAOimpl();
    	Scanner s = new Scanner(System.in); 
    	System.out.println("Enter Employee id");
        Integer EMP_ID=s.nextInt();
        s.nextLine();
        System.out.println("Enter Employee name");
        String EMP_NAME = s.nextLine();
        System.out.println("Enter Employee DEPARTMENT ID");
        Integer EMP_D_Id = s.nextInt();
        System.out.println("Enter Employee Status");
        Integer EMP_Status= s.nextInt();
        
        System.out.println("Enter Employee Salary");
        Integer EMP_SALARY = s.nextInt();
        e.setE_id(EMP_ID);
        e.setE_name(EMP_NAME);
        e.setD_id(EMP_D_Id);
        e.setE_status(EMP_Status);
        e.setE_sal(EMP_SALARY);
        System.out.println(e);
        try {
			if(Ein.signup(e)) {
			  System.out.println("RECORD SUCCESSFULLY INSRTED.....");       	
			 }
			else {
				System.out.println("Somthing went wrong..plz try again");
			}
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}	
    }
    public void SelectbyId() 
    {
    	Scanner s = new Scanner(System.in);
    	Employee e = new Employee();
    	System.out.println("Enter id...");
    	Integer E_id = s.nextInt();
    	e.setE_id(E_id);
    	EmpDAOinterface Ein = new EmpDAOimpl();
    	 e=Ein.selectEmp(E_id);
    	 System.out.println(e);
    }
    public void softDeletbyStatus() 
    {
    	Scanner s = new Scanner(System.in);
    	Employee e = new Employee();
    	System.out.println("Enter id...");
    	Integer E_id = s.nextInt();
    	e.setE_id(E_id);
    	EmpDAOinterface Ein = new EmpDAOimpl();
    	 if(Ein.softDelete(E_id)) {
    	 System.out.println("soft delete....success");
    }
    else 
    {
    	System.out.println("somthing wrong...");
    }
    }
    public void hikeSalary1() throws SQLException 
    {
    	Scanner s = new Scanner(System.in);
    	Employee e = new Employee();
    	System.out.println("Enter id...");
    	Integer E_id = s.nextInt();
    	e.setE_id(E_id);
    	EmpDAOinterface Ein = new EmpDAOimpl();
    	 Integer i=Ein.hikeSalary(E_id);
    	 System.out.println(i);
    }
    public void hikeById1() throws SQLException 
    {
    	Scanner s = new Scanner(System.in);
    	Employee e = new Employee();
    	System.out.println("Enter id...");
    	Integer E_id = s.nextInt();
    	e.setE_id(E_id);
    	EmpDAOinterface Ein = new EmpDAOimpl();
    	 Integer i= Ein.HikeById(E_id);
    	 System.out.println(i);
    }
    public void SalaryById1() throws SQLException 
    {
    	Scanner s = new Scanner(System.in);
    	Employee e = new Employee();
    	System.out.println("Enter id..");
    	Integer E_id = s.nextInt();
    	e.setE_id(E_id);
    	EmpDAOinterface Ein = new EmpDAOimpl();
    	Integer i = Ein.SalaryById(E_id);
    	System.out.println(i);
    }
    
	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
      Emp  e1 = new Emp();
      EmpDAOinterface Ein = new EmpDAOimpl();
      Scanner s = new Scanner(System.in);
      System.out.println("Enter your choice...!");
      Integer choice = s.nextInt();
      switch(choice) 
      {
      case 1:System.out.println("Insert record of employee........");
    	    e1.InsertRecodofEmp();
            break;
      case 2:System.out.println(" you want to data employee...");
    	   e1.SelectbyId();
           break;
      case 3:System.out.println("DELETE DATA.....");
    	    e1.softDeletbyStatus();
            break; 
      case 4:System.out.println("hikeSalary.......");
    	   e1.hikeSalary1();
           break;
      case 5:
    	    System.out.println("hike salary by id"); 
    	    e1.hikeById1();
            break;
      case 6:
    	  System.out.println("Salary by id plz enter id you want salary");
    	   e1.SalaryById1();
    	   break;
      case 7:System.out.println("hikesalary......");
           EmpDAOinterface Ein1 = new EmpDAOimpl();
           Ein.hikeSalary();
           break;
      case 8:System.out.println("callable....");
    	  EmpDAOinterface Ein2 = new EmpDAOimpl();
    	  Ein.CL_salaryById(1);
    	  break;
      
      
      }
     

	}

}
