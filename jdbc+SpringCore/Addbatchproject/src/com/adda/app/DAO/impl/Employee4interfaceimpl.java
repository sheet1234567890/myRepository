package com.adda.app.DAO.impl;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.adda.app.DAO.IEmployee4interface;
import com.adda.app.bean.Employee4;
import com.adda.app.util.DbConnection;


public class Employee4interfaceimpl implements IEmployee4interface {
	
	
		
	
	public void InsertRecord(ArrayList l) throws SQLException {
		// TODO Auto-generated method stub
		Connection con = DbConnection.Db_Connection();
		Statement stmt=con.createStatement(); 
		Employee4 e = null;
		for(int i=0;i<l.size();i++)
		{
		  e=(Employee4) l.get(i);
		  stmt.addBatch("insert into emp(e_id,e_name,e_salary) values(" +e.getE_id()+",'" +e.getE_name()+"',"+e.getE_salary()+" )");
		}
	   stmt.executeBatch();
	}




}
