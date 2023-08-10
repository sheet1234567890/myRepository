package com.adda.app.DAO.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

import com.adda.app.DAO.ITeacherInterface;
import com.adda.app.bean.Teacher;
import com.adda.app.util.DbConnection;

public class TeacherInterfaceimpl implements ITeacherInterface
{
	private final String INSERT_SQL="INSERT INTO teacher VALUES(?,?,?,?)";
	@Override
	public void InsertRecord(ArrayList l) throws SQLException {
		// TODO Auto-generated method stub
		Connection con = DbConnection.Db_Connection();
		   Teacher t = null;
		   PreparedStatement pstmt = con.prepareStatement(INSERT_SQL);
		   for(int i=0;i<l.size();i++) 
	      {	   
	    	t=(Teacher) l.get(i);  
		    pstmt.addBatch("insert into teacher(T_id,T_name,T_subject,T_Dep)values("+t.getT_id()+",'"+t.getT_name()+"','"+t.getT_Subject()+"','"+t.getT_Dep()+"')");
	      }
		   pstmt.executeBatch(); 
	    
	}

}
