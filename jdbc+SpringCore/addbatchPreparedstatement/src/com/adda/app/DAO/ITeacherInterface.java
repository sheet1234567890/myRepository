package com.adda.app.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

import com.adda.app.util.DbConnection;

public interface ITeacherInterface {
	
	public void InsertRecord(ArrayList l)throws SQLException;
   
}
