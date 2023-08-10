package com.adda.DAO3;

import java.sql.SQLException;
import java.util.List;

import com.adda.bean3.Emp3;

public interface Emp3interface {
      
	public List<Emp3> Empfilter(String e_name,String e_email,String e_location) throws SQLException;
	public List <Emp3> Empprocedure(Integer id) throws SQLException;
}
