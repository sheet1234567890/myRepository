package com.adda.app.dao;

import java.sql.SQLException;

import com.adda.app.bean.User;

public interface UserDAOinterface {
	public void Data()throws Exception;
	public Boolean login(String email,String password)throws Exception;
	public Boolean Signup(User user) throws SQLException;
    public Boolean Update(User user)throws SQLException;
    public Boolean SoftDelet(User user)throws SQLException;
	public Boolean CreateTable() throws SQLException;
}
