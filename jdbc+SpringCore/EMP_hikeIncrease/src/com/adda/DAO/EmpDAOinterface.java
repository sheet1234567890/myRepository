package com.adda.DAO;

import java.sql.SQLException;
import java.util.List;

import com.adda.bean.Employee;

public interface EmpDAOinterface {
  public Boolean signup(Employee e)throws Exception;
  public  Employee selectEmp(Integer id); 
  public Boolean softDelete(Integer id);
  public Integer hikeSalary(Integer id) throws SQLException;
  public Integer HikeById(Integer e_id);
  public Integer SalaryById(Integer e_id) throws SQLException;
  public void hikeSalary() throws SQLException;
  public List<Employee> CL_salaryById(Integer id) throws SQLException;
 
  // public Integer CL_hikeSalary(Integer id) throws SQLException;
  
}
