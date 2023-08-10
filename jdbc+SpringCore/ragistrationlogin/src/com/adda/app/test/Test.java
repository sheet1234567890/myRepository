package com.adda.app.test;

import java.sql.SQLException;
import java.util.Scanner;

import com.adda.app.bean.User;
import com.adda.app.dao.UserDAOinterface;
import com.adda.app.dao.impl.UserDAOinterfaceImp;

public class Test {

	public  void newUserSignUp()throws Exception {
		// TODO Auto-generated method stub
      User u = new User();
      UserDAOinterface uin = new UserDAOinterfaceImp();
      Scanner s = new Scanner(System.in);
      System.out.println("Enter User id: ");
      Integer User_id = s.nextInt();
      s.nextLine();
      System.out.println("Enter User Name: ");
      String User_Name = s.nextLine();
      System.out.println("Enter User email");
      String User_Email=s.nextLine();
      System.out.println("Enter User Address");
      String User_Address=s.nextLine();
      System.out.println("Enter User Pwd");
      String User_PWD = s.nextLine();
      System.out.println("Enter status..");
      Integer status =s.nextInt();
      
      u.setuId(User_id);
      u.setuName(User_Name);
      u.setuEmail(User_Email);
      u.setuPassword(User_PWD);
      u.setuAddress(User_Address);
      u.setStatus(status);
      try {
    	  if(uin.Signup(u))
    		  System.out.println("Ragistration successfully....!");
      }
      catch(Exception e){
    	  Test t = new Test();
    	  System.out.println(e.getMessage());
    	  t.newUserSignUp();
      }  
	}

	public void loginUser()throws Exception{
		Scanner s1 = new Scanner(System.in);
		
		UserDAOinterface uin1 = new UserDAOinterfaceImp();
		System.out.print("Enter User email");
	    String User_Email=s1.nextLine();
	    System.out.print("Enter User Pwd");
	    String User_PWD = s1.nextLine();
	    if(uin1.login(User_Email,User_PWD)) {
	    	System.out.println("LOGIN SUCCESS......Thankyou!");
	    }
	    else
	    {   Test t = new Test();
	    	System.out.println("INVALID LOGIN ID OR PASSWORD....PLZ TRY AGAIN ...!");
	    	t.loginUser();
	    }
	}
	public void Updateinfo() 
	{
		Scanner s = new Scanner(System.in);
		User u = new User();
		UserDAOinterface uin2 = new UserDAOinterfaceImp();
		System.out.println("Enter id you want replace email and password: ");
		Integer User_Id = s.nextInt();
		u.setuId(User_Id);
		s.nextLine();
		System.out.println("Enter Your new Email...");
		String User_Email=s.nextLine();
		u.setuEmail(User_Email);
		System.out.println("Enter your new password: ");
		String User_passWord = s.nextLine();
		
		u.setuPassword(User_passWord);
		try {
			if(uin2.Update(u)) {
				System.out.println("UPDATE SUCCESSFULL....");
			}
			else
			{
				System.out.println("TRY AGAIN....");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public Test() 
	{
		
	}
		public static void main(String[] args)throws Exception
		{
			Test t = new Test();
			Scanner s = new Scanner(System.in);
			System.out.println("Enter your choice.....\n1.SIGNUP....\n2.LOGIN....\n3.Upddate...\n4.DELETE...\n5 Create table....\n6.Exit");
			int choice = s.nextInt();
			switch(choice) {
			case 1:System.out.println("Signup here.....");
			t.newUserSignUp();
			break;
			case 2:System.out.println("Login here.....");
			t.loginUser();
			break;
			case 3:System.out.println("...UPDATE...");
			t.Updateinfo();
			break;
			case 4: System.out.println("....SOFT_DELETE....");
			//t.Soft_DELETE();
			break;
			case 5:UserDAOinterface uin2 = new UserDAOinterfaceImp();
				 //uin2.CreateTable();
		
			uin2.Data();
				 break;
			case 6:
				System.exit(0);
			
		}
		}
	}

