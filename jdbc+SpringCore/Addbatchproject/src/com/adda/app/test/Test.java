package com.adda.app.test;

import java.sql.SQLException;
import java.util.ArrayList;           //Addbatch Statement.........!

import com.adda.app.DAO.impl.Employee4interfaceimpl;
import com.adda.app.bean.Employee4;

public class Test {
                                 //TASK....3
	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		Employee4interfaceimpl e = new Employee4interfaceimpl();
		ArrayList l = new ArrayList();
		Employee4 e1 = new Employee4();
		e1.setE_name("shivani patidar");
		e1.setE_id(18);
		e1.setE_salary(50000);
		l.add(e1);
		Employee4 e2 = new Employee4();
		e2.setE_id(19);
		e2.setE_name("suhana");
		e2.setE_salary(60000);
		l.add(e2);
		e.InsertRecord(l);	
		System.out.println("done");
	}

}
