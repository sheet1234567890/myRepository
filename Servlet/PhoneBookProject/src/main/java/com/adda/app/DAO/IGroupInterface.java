package com.adda.app.DAO;

import java.util.List;

import com.adda.app.Bean.Comman;
import com.adda.app.Bean.Contect;
import com.adda.app.Bean.Group;

public interface IGroupInterface {
	public Boolean save(Group group);
	public List<Group>viewAllGroup(Integer id);
	public Boolean DeleteGroupById(Integer id);
	public Group updateGroupById(Integer id);
    public List<Contect>GlistContect(Integer uid,Integer gid);
    public Boolean CheakContectToAddGroup(Integer conid,Integer uid,Integer gid);
    public Integer commandata(Integer gid,Integer uid);
    public Boolean GDeleteContect(Integer cid ,Integer gid);
	public List<Comman> commanlist(Integer gid, Integer uid);
	public Boolean GroupFav(Integer id,Boolean isfav);
	public Group GroupById(Integer id);
	public Integer isExistContect(Integer uid,Integer gid);
}
