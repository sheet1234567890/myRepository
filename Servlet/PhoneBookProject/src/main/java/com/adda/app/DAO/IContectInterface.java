package com.adda.app.DAO;

import java.util.List;

import com.adda.app.Bean.Contect;

public interface IContectInterface {
	
	public Boolean save(Contect contect);
	public List<Contect>viewAllContect(Integer id);
	public Boolean deleteContectById(Integer id);
	public Contect updateContectById(Integer id);
    public Boolean isContactFav(Integer id,Boolean conisfav);
    public Integer TotalContect(Integer id);
}
