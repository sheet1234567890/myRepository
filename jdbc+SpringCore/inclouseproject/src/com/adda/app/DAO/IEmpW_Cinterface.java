package com.adda.app.DAO;

import java.sql.SQLException;
import java.util.List;

import com.adda.app.EmployeeWorklocation;

public interface IEmpW_Cinterface {
       public List <EmployeeWorklocation>workLocation(String worklocation)throws SQLException;
       public List <EmployeeWorklocation>joinDate(String join_date1,String join_date2) throws SQLException;
       public List<EmployeeWorklocation>workLocation2(String wlocation1,String wlocation2) throws SQLException;
	   
       
       public List<EmployeeWorklocation>clWorkLocation() throws SQLException;
}
