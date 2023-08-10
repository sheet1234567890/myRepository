package com.adda.app.DAO;

import java.sql.SQLException;
import java.util.List;

import com.adda.app.Bean.User;

public interface IUserInterface {
	public Boolean save(User user) throws SQLException;
	public List<User>viewAllUser(String role);
	public Boolean deleteById(Integer id);
	public User updateById(Integer id);
	public User LoginUser(String email,String password) ;
	public Boolean changPassword(String oldpass,String newpass,Integer id );
	public Integer cheakEmail(String email);
	public Boolean CheakPass(String pass,Integer id);
}
