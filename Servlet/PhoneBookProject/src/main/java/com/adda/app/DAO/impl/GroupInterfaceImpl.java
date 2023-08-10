package com.adda.app.DAO.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.adda.app.Bean.Comman;
import com.adda.app.Bean.Contect;
import com.adda.app.Bean.Group;
import com.adda.app.DAO.IGroupInterface;
import com.adda.app.util.DbConnection;

public class GroupInterfaceImpl implements IGroupInterface {
private static final String INSERT_GROUP="Insert into phonebook.group(g_name,g_isFav,u_id,g_id) Values(?,?,?,?)";
private static final String UPDATE_GROUP="update phonebook.group set g_name=? where g_id=?";
private static final String VIEW_GROUP="select*from phonebook.group where u_id=?";
private static final String DELETE_GROUP="Delete from phonebook.group where g_id=?";
private static final String GROUP_UPDAE_ID="Select*from phonebook.group where u_id=?";
private static final String GROUP_CON_LIST="Select*from contect where c_id  in (Select c_id from comman where g_id=? and u_id=?)";
private static final String COMMAN_LIST="Select c_id from comman where u_id=? And g_id=?";
private static final String INSERT_CONTECT_IN_GROUP="Insert into comman Values(?,?,?)";
private static final String G_DELETE_CONTECT="delete from comman where c_id=? AND g_id=?";
private static final String GROUP_FAV="update phonebook.group set g_isFav=? where u_id=?";
private static final String GROUP_BY_ID="Select * from phonebook.group where g_id=?";
private static final String IS_EXIST="Select c_id from comman where u_id=? And g_id=?";
	private Connection con=null;
	private PreparedStatement pstmt = null;
	private ResultSet rs=null;
	@Override
	public Boolean save(Group group) {
	  con = DbConnection.getConnection();
	  Integer max=100000000;
      Integer min=0;
	  Integer i =group.getgId();
	  System.out.println(i);
	  try {
	  if(group.getgId()==null) 
	  {
		  pstmt=con.prepareStatement(INSERT_GROUP);
		  pstmt.setString(1, group.getgName());
		  pstmt.setBoolean(2, group.getgIsfav());
		  pstmt.setInt(3, group.getUid());
		  pstmt.setInt(4,(int)(Math.random()*(max-min+1)+min));
		  System.out.println("inserted");
	  }
	  
	  else 
	  {
		pstmt = con.prepareStatement(UPDATE_GROUP);
		System.out.println("updated");
		 pstmt.setString(1, group.getgName());
		pstmt.setInt(2, group.getgId());
	  }
	  
	  if(pstmt.executeUpdate()>0) {
		  return true;
	  }
	  }
	  catch(Exception e) 
	  {
		  e.printStackTrace();
	  }
	return false;
	 
	}

	@Override
	public List<Group> viewAllGroup(Integer id) {
		con=DbConnection.getConnection();
		List<Group>glist = new ArrayList();
		try {
		pstmt = con.prepareStatement(VIEW_GROUP);
		pstmt.setInt(1,id);
		ResultSet rs = pstmt.executeQuery();
		while(rs.next()) 
		{
			Group g = new Group();
			g.setgId(rs.getInt("g_id"));
			g.setgName(rs.getString("g_name"));
			g.setgIsfav(rs.getBoolean("g_isFav"));
			glist.add(g);
		}
		}
		catch(Exception e) 
		{
			e.printStackTrace();
		}
		return glist;
	}

	@Override
	public Boolean DeleteGroupById(Integer id) {
		con=DbConnection.getConnection();
		try {
		pstmt = con.prepareStatement(DELETE_GROUP);
		pstmt.setInt(1, id);
		System.out.println(pstmt);
		if(pstmt.executeUpdate()>0) 
		{
			System.out.println("delete");
			return true;
		}
		else 
		{ 
			 System.out.println("not deleted");
			return false;
			
		}
		}
		catch(Exception e) 
		{
			e.printStackTrace();
		}
		return false;
	}

	//@Override
	public Group updateGroupById(Integer id) {
		con=DbConnection.getConnection();
		Group g = new Group();
		try {
		pstmt = con.prepareStatement(GROUP_UPDAE_ID);
		pstmt.setInt(1, id);
		System.out.println(pstmt);
		 rs = pstmt.executeQuery();
		rs.next();
		g.setgId(rs.getInt("g_id"));
		g.setgName(rs.getString("g_name"));
		g.setgIsfav(rs.getBoolean("g_isFav"));
		}
		catch(Exception e) 
		{
			e.printStackTrace();
		}
		System.out.println(g);
		return g;
	}

	@Override
	public List<Contect> GlistContect(Integer uid, Integer gid) {
	 con = DbConnection.getConnection();
	 List<Contect>conList=new ArrayList<Contect>();
	try { 
	 pstmt=con.prepareStatement(GROUP_CON_LIST);
	 pstmt.setInt(1, gid);
	 pstmt.setInt(2, uid);
	 System.out.println(pstmt);
	 rs = pstmt.executeQuery();
	 while(rs.next()) 
	 {
		    Contect c1 = new Contect();
			c1.setcId(rs.getInt("c_id"));
			c1.setcName(rs.getString("c_name"));
			c1.setcEmail(rs.getString("c_email"));
			c1.setcMobile(rs.getString("c_mobile"));
			c1.setcAddress(rs.getString("c_address"));
			c1.setcIsfav(rs.getBoolean("c_isfav"));
			c1.setCuId(rs.getInt("u_id"));
			conList.add(c1);
	 }
	}catch(Exception e) 
	{
		e.printStackTrace();
	}
	System.out.println(conList);
		return conList;
	}

	@Override
	public Boolean CheakContectToAddGroup( Integer conid,Integer uid, Integer gid) {
		con=DbConnection.getConnection();
		Integer p=0;
		try{
		pstmt=con.prepareStatement(INSERT_CONTECT_IN_GROUP);
		pstmt.setInt(1, conid);
		pstmt.setInt(2,uid);
		pstmt.setInt(3, gid);
		p=pstmt.executeUpdate();
		}
		catch(Exception e) 
		{
			e.printStackTrace();
		}
	
		if(p>0) {
			
		return true;
		}
		else {
			return false;
		}
}

	
	

	@Override
	public Boolean GDeleteContect(Integer cid ,Integer gid ) {
		con = DbConnection.getConnection();
		Integer i = 0;
		try {
		pstmt=con.prepareStatement(G_DELETE_CONTECT);
		pstmt.setInt(1, cid);
		pstmt.setInt(2, gid);
	    i=pstmt.executeUpdate();
		}
		catch(Exception e) 
		{
			e.printStackTrace();
		}
		if(i>0) 
		{
			return true;
		}
		else 
		{
			return false;
		}
	}

	@Override
	public List<Comman> commanlist(Integer gid, Integer uid) {
		con=DbConnection.getConnection();
		List<Comman> l = new ArrayList<Comman>();
		try{pstmt=con.prepareStatement(COMMAN_LIST);
		pstmt.setInt(1, uid);
		pstmt.setInt(2, gid);
		rs= pstmt.executeQuery();
		
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) 
			{
				Comman c = new Comman();
				c.setCcid(rs.getInt("c_id"));
				l.add(c);
			}
		
		}
		catch(Exception e) 
		{
			e.printStackTrace();
		}
		System.out.println(l+":->list");
		return  l;
		}

	@Override
	public Integer commandata(Integer gid, Integer uid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean GroupFav(Integer id, Boolean isfav) {
		con=DbConnection.getConnection();
		Integer b = null;
		try{
			pstmt=con.prepareStatement(GROUP_FAV);
		pstmt.setBoolean(1, isfav);
		pstmt.setInt(2, id);
		System.out.println(pstmt);
		b=pstmt.executeUpdate();
		}
		catch(Exception e) 
		{
			e.printStackTrace();
		}
		if(b>0)
		return true;
		else
			return false;
	}

	@Override
	public Group GroupById(Integer id) {
		con= DbConnection.getConnection();
		Group g = new Group();
		try{pstmt=con.prepareStatement(GROUP_BY_ID);
		pstmt.setInt(1, id);
		rs=pstmt.executeQuery();
		if(rs.next()) 
		{
			g.setgId(rs.getInt("g_id"));
			g.setgName(rs.getString("g_name"));
			g.setgIsfav(rs.getBoolean("g_isFav"));
			g.setUid(rs.getInt("u_id"));
			System.out.println(g);
		}
		}catch(Exception e) 
		{
			e.printStackTrace();
		}
		return g;
	}

	@Override
	public Integer isExistContect(Integer uid, Integer gid) {
		con=DbConnection.getConnection();
		try {
		pstmt=con.prepareStatement(IS_EXIST);
		pstmt.setInt(1, uid);
		pstmt.setInt(2, gid);
		rs=pstmt.executeQuery();
		if(rs.next()) 
		{
			return rs.getInt(1);
		}
		}catch(Exception e) 
		{
			e.printStackTrace();
			return -1;
		}
		return -1;
		
	}
	
	}


