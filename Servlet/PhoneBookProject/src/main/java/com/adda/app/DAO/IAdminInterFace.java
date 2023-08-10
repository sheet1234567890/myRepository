package com.adda.app.DAO;

import java.sql.SQLException;
import java.util.List;

import com.adda.app.Bean.Admin;

public interface IAdminInterFace {
  public Boolean save(Admin admin) throws SQLException;
  public List<Admin> viewAddminList();
  public Boolean deleteAdminById(Integer id);
  public Admin updateAdminById(Integer id);
  public Integer countUser(Integer id) ;
  
}
