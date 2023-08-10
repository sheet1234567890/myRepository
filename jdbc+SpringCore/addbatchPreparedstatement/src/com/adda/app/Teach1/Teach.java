package com.adda.app.Teach1;

import java.sql.SQLException;
import java.util.ArrayList;


import com.adda.app.DAO.impl.TeacherInterfaceimpl;

import com.adda.app.bean.Teacher;

public class Teach {
                                                 //TASK...4
	public static void main(String[] args) throws SQLException {           
		// TODO Auto-generated method stub                               
		TeacherInterfaceimpl t1 = new TeacherInterfaceimpl();
		ArrayList l = new ArrayList();
		Teacher t = new Teacher();
		 t.setT_id(10);
		 t.setT_name("zzzzzz");
		 t.setT_Dep("cs");
		 t.setT_Subject("computer science");
		 l.add(t);
		 Teacher t11 = new Teacher();
		 t11.setT_id(20);
		 t11.setT_name("yyyyy");
		 t11.setT_Dep("IT");
		 t11.setT_Subject("Maths");
		 l.add(t11);
		 t1.InsertRecord(l);
		 System.out.println("DONE");
	}

}
