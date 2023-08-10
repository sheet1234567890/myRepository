package com.adda.app.Controller;

import java.io.IOException;
import java.net.http.HttpRequest;
import java.sql.SQLException;
import java.util.List;

import com.adda.app.Bean.Admin;
import com.adda.app.Bean.Comman;
import com.adda.app.Bean.Contect;
import com.adda.app.Bean.Group;
import com.adda.app.Bean.User;
import com.adda.app.DAO.IAdminInterFace;
import com.adda.app.DAO.IContectInterface;
import com.adda.app.DAO.IGroupInterface;
import com.adda.app.DAO.IUserInterface;
import com.adda.app.DAO.impl.GroupInterfaceImpl;
import com.adda.app.DAO.impl.IAdminInterfaceImpl;
import com.adda.app.DAO.impl.IContectInterfaceImpl;
import com.adda.app.DAO.impl.UserInterfaceimpl;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

/**
 * Servlet implementation class PhoneBookController
 */
public class PhoneBookController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private IUserInterface i = new UserInterfaceimpl();
    private IContectInterface i1 = new IContectInterfaceImpl();
    private IAdminInterFace i2 = new IAdminInterfaceImpl();
    private IGroupInterface i3 = new GroupInterfaceImpl();
    private User u=null;
    private User admin=null;
    private Contect c=null;
    private Admin a=null;
    private Group g=null;
    private List<Contect>conlist=null;
    private List<User>userlist=null;
    private List<Group>grouplist=null;
    private List commanlist=null;
    private RequestDispatcher rd=null;
    private HttpSession session;
    private Integer id;
    private Integer count = 0;
    /**
     * Default constructor. 
     */
    public PhoneBookController() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String action = request.getParameter("Action");
		session=request.getSession();
		if(session.getAttribute("uId")!=null|| action.equals("ADDUSER")||action.equals("LOGIN")) {
		System.out.println(action);
		switch(action) 
		{
		case"USERDESBOARD":
			userToDesktop(request,response);
			break;
			case "ADDUSER":
			u=new User();
			u.setuName(request.getParameter("Name"));
			
			//session = request.getSession();
			//session.setAttribute("uId", u.getuId());
			u.setuEmail(request.getParameter("Email"));
			u.setuAddress(request.getParameter("Address"));
			u.setuMobile(request.getParameter("Mobile"));
			u.setuPassword(request.getParameter("Password"));
			u.setuRole(request.getParameter("Role"));
			System.out.println(u+"=====");
			
			try {
				if(i.save(u)) 
				{
					System.out.println("Add One User");
					rd = request.getRequestDispatcher("./index.jsp");
		             rd.forward(request, response);
				}
				else 
				{
						String msg="This Email already Exist...";
						request.setAttribute("msg", msg);
						System.out.println(msg);
						rd = request.getRequestDispatcher("./Usersignup.jsp");
			            rd.forward(request, response);	
				 }
			} catch (Exception e1) {
				
				System.out.println(e1.getMessage());
			}
		

			break;
		case "DESBOARD1":
			userToDesktop(request,response);
			break;
		case"LOGIN":
			u=new User();
			String email=request.getParameter("Email");
			String pass=request.getParameter("Password");
			u=i.LoginUser(email,pass);
			session = request.getSession();
			/*
			 * session.setAttribute("uId", u.getuId()); System.out.println(u);
			 * System.out.println(u.getuId());
			 */
			session.setAttribute("uId", u);
			
		    if(u.getuEmail()!=null&&u.getuPassword()!=null) 
		    {

              if(u.getuRole().equals("user")) 
              {
            	  session = request.getSession();
    			  session.setAttribute("uId", u.getuId());
    				userToDesktop(request,response);
              }
              else 
              { 
            	  session = request.getSession();
            	  session.setAttribute("uId",u.getuId());
            	  userToDesktop(request,response);
              }
              
			}
		    
			else
			{   
				  String msg ="Incorrect email and password";
				  request.setAttribute("msg", msg);
	              rd = request.getRequestDispatcher("./Login.jsp");
	              rd.forward(request, response);
			}
			
			
		    
		    break;		
		case"LOGOUT":
			System.out.println("LOGOUT..........");
			session.invalidate();
			rd=request.getRequestDispatcher("./Login.jsp");
			rd.forward(request, response);
		
			break;
			
		case "UPDATEPROFILE":
			u=new User();
			u.setuId((Integer)session.getAttribute("uId"));
			u.setuName(request.getParameter("Name"));
			u.setuEmail(request.getParameter("Email"));
			u.setuAddress(request.getParameter("Address"));
			u.setuMobile(request.getParameter("Mobile"));
			u.setuRole(request.getParameter("Role"));
			if(i.cheakEmail(request.getParameter("Email")).equals(session.getAttribute("uId"))||i.cheakEmail(request.getParameter("Email")).equals(-1)) {
			try {
				i.save(u);
			} catch (SQLException e) {
				e.printStackTrace();
			}
			}
			else 
			{
				String msg="This Email already Exist...Can't update your profile";
				request.setAttribute("msg", msg);
			}
			userToDesktop(request,response);
             break;
		case "GETUSER":
			getuser(request,response);
             break;
		case "TOCREATCONTECT":
			u=new User();
			u=i.updateById((Integer)session.getAttribute("uId"));
			grouplist = (List<Group>) i3.viewAllGroup(((Integer)session.getAttribute("uId")));
			count=i2.countUser((Integer)session.getAttribute("uId"));
			System.out.println(count);
			request.setAttribute("user", u);
			request.setAttribute("count", count);
			request.setAttribute("glist", grouplist);
			rd=request.getRequestDispatcher("./pages/ui-features/creatapp.jsp");
			rd.forward(request, response);
			break;
		case "ADDCONTECT":
			c=new Contect();
			u=new User();
			Integer f1 =0;
			String phone=request.getParameter("Phone");
			conlist=i1.viewAllContect((Integer)session.getAttribute("uId"));
			for(int i=0;i<conlist.size();i++) 
			{
			  if(conlist.get(i).getcMobile().equals(phone))
			  {
			  f1=1;
			  break;
			  }
			  
			}
			if(f1==0) {
			 c.setcName(request.getParameter("Name"));
			 c.setcEmail(request.getParameter("Email"));
			 c.setcMobile(request.getParameter("Phone"));
			 c.setcAddress(request.getParameter("Address"));
			 c.setcIsfav(false);
			 c.setCuId((Integer)session.getAttribute("uId"));
			 System.out.println(c);
			 i1.save(c);
			
			}
			viewContect(request,response);
		
			break;
		case "TOVIEWCONTECT":
			viewContect(request,response);
			break;
		case"TOVACCOUNTBYADMIN":
			viewUserByAdmin(request,response);
			break;
		case "GROUPCONTECTVIEW":
			 viewGroupContect(request,response);
			 break;
		case "TOEDITCONTECT":
			 c = i1.updateContectById(Integer.parseInt(request.getParameter("cid")));
			 u = new User();
			 u=i.updateById((Integer)(session.getAttribute("uId")));
			 count=i2.countUser((Integer)session.getAttribute("uId"));
			 request.setAttribute("count", count);
			 request.setAttribute("user", u);
			 request.setAttribute("contect",c );
			 grouplist = (List<Group>) i3.viewAllGroup(((Integer)session.getAttribute("uId")));
			 request.setAttribute("glist", grouplist);
			 rd=request.getRequestDispatcher("./pages/ui-features/editContact.jsp");
			 rd.forward(request, response);
			 break;
		case "EDITCONTECT":
			c.setcId(Integer.parseInt(request.getParameter("conId")));
			c.setcName(request.getParameter("name"));
			c.setcEmail(request.getParameter("email"));
			c.setcMobile(request.getParameter("mobaile"));
			c.setcAddress(request.getParameter("address"));
			i1.save(c);
			viewContect(request,response);
			 break;
		case "DELETECONTECT":
			 i1.deleteContectById(Integer.parseInt(request.getParameter("cid")));
			 viewContect(request,response);
			 break;
		case "DELETEUSER":
			 i.deleteById((Integer)session.getAttribute("uId"));
			 userToDesktop(request,response);
			break;
		case "CHANGEPASSWORD":
			  String oldpass=request.getParameter("oldpassword");
			  
			  String newpass=request.getParameter("newpassword");
			  String confirm= request.getParameter("confirmPassword");
			  System.out.println(newpass+" new pass..........");
			  System.out.println(confirm+"confirm pass...............");
			  
			
			  if(newpass.equals(request.getParameter("confirmPassword"))) 
			  {
				  if(i.CheakPass(oldpass,(Integer)(session.getAttribute("uId"))))
					  {
				           i.changPassword(oldpass, newpass, (Integer)session.getAttribute("uId"));
				           String msg = "Successfull password change";
						   request.setAttribute("msg", msg);
			          
			          }
				  else 
					  {
						  String msg = "current password is wrong";
						  request.setAttribute("msg", msg);
						  System.out.println("current password is wrong"); 
					  } 
			  }
			  else 
			  {
				  String msg = "confirm password is wrong";
				  request.setAttribute("msg", msg);
				  System.out.println("confirm password is wrong"); 
 
			  }
			  userToDesktop(request,response);
			  break;
			  
		case "CONTECTFAVORAITE":
			  Boolean isfav=Boolean.parseBoolean(request.getParameter("conisfav"));
			  if(isfav) 
			  {
				  isfav = false;
			  }
			  else 
			  {
				  isfav=true;
			  }
			  i1.isContactFav(Integer.parseInt(request.getParameter("cid")), isfav);
			  viewContect(request,response);
				 break;
		case"GCONTECTFAVORAITE":
		      
			   Boolean gisfav=Boolean.parseBoolean(request.getParameter("conisfav"));
			  if(gisfav) 
			  {
				  gisfav = false;
			  }
			  else 
			  {
				  gisfav=true;
			  }
			  i1.isContactFav(Integer.parseInt(request.getParameter("cid")), gisfav);
	
			  viewGroupContect(request,response);
			 break;	 
		case"GROUPFAV":
			Boolean gfav = Boolean.parseBoolean(request.getParameter("gisfav"));
			if(gfav) 
			{
				gfav=false;
			}
			else 
			{
				gfav=true;
			}
			i3.GroupFav((Integer)session.getAttribute("uId"), gfav);
			 viewGroupContect(request,response);
			break;
		case "TOCREATEGROUP":
			 u= new User();
			 u=i.updateById((Integer)session.getAttribute("uId")); 
			 grouplist = (List<Group>) i3.viewAllGroup(((Integer)session.getAttribute("uId")));
			 count=i2.countUser((Integer)session.getAttribute("uId"));
			 request.setAttribute("count", count);
			 request.setAttribute("user", u);
			 request.setAttribute("glist", grouplist);
       	     rd = request.getRequestDispatcher("./pages/ui-features/createcase.jsp");
             rd.forward(request, response); 
             break;
		case "ADDGROUP":
			 g= new Group();
			 String name= request.getParameter("gname");
			 Integer f=0;
			 grouplist = (List<Group>) i3.viewAllGroup(((Integer)session.getAttribute("uId")));
			 for(int i=0;i<grouplist.size();i++) 
			 {
				if(grouplist.get(i).getgName().equals(name)) 
				{    
					f=1;
					System.out.println("this group already Exist .....!");
					String msg = "this group already Exist .....!";
					request.setAttribute("msg", msg);
					break;
				} 
					
			 }
				  if(f==0) { 
					  g.setgName(name); 
					  g.setUid((Integer)session.getAttribute("uId"));
				      g.setgIsfav(false);
				      i3.save(g);
				  }
				  userToDesktop(request,response);
			 break;
		case "GETGROUP":
			 viewGroupContect(request,response);
			  break;
		case"GETALLCONTECTFORGROUP":
			viewAllContectForGroup(request,response);
			break;
		case"ADDCONTECTTOGROUP":
			addContectInGroup(request,response);
			break;
		case"GDELETECONTECT":
			 i3.GDeleteContect(Integer.parseInt(request.getParameter("cid")),Integer.parseInt(request.getParameter("gid")));
			 viewGroupContect(request,response);
			 break;
		case"DELETEGROUP":
			i3.DeleteGroupById(Integer.parseInt(request.getParameter("gid")));	
			userToDesktop(request,response);
			break;
		case"USERDELETE":
			System.out.println("sheetal");
			i.deleteById((Integer)session.getAttribute("uId"));	
			response.sendRedirect("./userdeletethenSignupnewUser&login.jsp");
			break;
		case"DELETEUSERBYADMIN":
			i.deleteById(Integer.parseInt(request.getParameter("id")));
			viewUserByAdmin(request,response);
			break;
		case"AUBYADMIN":
			  u=i.updateById((Integer)session.getAttribute("uId"));
			  request.setAttribute("user", u);
			  rd = request.getRequestDispatcher("./AddUserByAdmin.jsp"); 
		      rd.forward(request,response);
			break;
		case"ADDUSERBYADMIN":
			u=new User();
			u.setuName(request.getParameter("Name"));
			u.setuEmail(request.getParameter("Email"));
			u.setuAddress(request.getParameter("Address"));
			u.setuMobile(request.getParameter("Mobile"));
			u.setuPassword(request.getParameter("Password"));
			u.setuRole(request.getParameter("Role"));
			try {
				if(i.save(u)) 
				{
					System.out.println("Add one user by admin");
				}
				else 
				{
					 String msg="This Email already Exist...can't create account";
						request.setAttribute("msg", msg);
				}
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
				 String msg="This Email already Exist...can't create account";
					request.setAttribute("msg", msg);
			}
			
		
			  
			  userToDesktop(request,response);
			
			break;
		case"TOEDITUSERBYADMIN":
			  u = new User();
			  u=i.updateById(Integer.parseInt(request.getParameter("id"))); 
			  admin=i.updateById((Integer)session.getAttribute("uId"));
			  grouplist =(List<Group>) i3.viewAllGroup(((Integer)session.getAttribute("uId")));
			  count=i2.countUser((Integer)session.getAttribute("uId"));
			  request.setAttribute("count", count);
			  request.setAttribute("admin",admin );
			  request.setAttribute("user",u );
			  request.setAttribute("glist", grouplist);
			  rd=request.getRequestDispatcher("./pages/login/editUserByAdmin.jsp");
			  rd.forward(request, response);
			 
		    break;
		case"UPDATEUSERBYADMIN":
			u=new User();
			u.setuId((Integer.parseInt(request.getParameter("id"))));
			u.setuName(request.getParameter("Name"));
			u.setuEmail(request.getParameter("Email"));
			u.setuAddress(request.getParameter("Address"));
			u.setuMobile(request.getParameter("Mobile"));
	        u.setuRole(request.getParameter("Role"));
	       
	        System.out.println(u+"**********************");
			if(i.cheakEmail(request.getParameter("Email")).equals(Integer.parseInt(request.getParameter("id")))||i.cheakEmail(request.getParameter("Email")).equals(-1)){
			try {
				i.save(u);
			} catch (SQLException e)
			{
				e.printStackTrace();
			}
			}
			else 
				
			{   
				String msg="This Email already Exist...can't update information";
				request.setAttribute("msg", msg);
				//EditUserByAdmin(request,response);
			}
			count=i2.countUser((Integer)session.getAttribute("uId"));
			request.setAttribute("count", count);
			viewUserByAdmin(request,response);
			break;
			case"GROUPEDIT":
				editgroup(request,response); 
			break;
		case"UPDATEGROUP":
			System.out.println("up.........................");
			g.setgId(Integer.parseInt(request.getParameter("gid")));
			g.setgName(request.getParameter("gname"));
			if(i3.save(g)) 
			{
			userToDesktop(request, response);
			}
			else 
			{
				 String msg="This Email already Exist...";
				 System.out.println(msg);
				 request.setAttribute("msg", msg);
				editgroup(request,response); 
				 
			}
			break;
		case"VIEWUSERCONTECTBYADMIN":
			viewUserContectByAdmin(request,response);
			
			break;
			  default:
	    	   break;
		}
		
	    }
		else 
		{
			response.sendRedirect("./Login.jsp");
			//userToDesktop(request, response);
		}	
		
		
}
	private void getuser(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 u = new User();
		 u=i.updateById((Integer)session.getAttribute("uId"));
		 grouplist = (List<Group>) i3.viewAllGroup(((Integer)session.getAttribute("uId")));
		 count=i2.countUser((Integer)session.getAttribute("uId"));
		 request.setAttribute("count", count);
		 request.setAttribute("user", u);
		 request.setAttribute("glist", grouplist);
   	     rd = request.getRequestDispatcher("./pages/login/profile.jsp");
         rd.forward(request, response);
		
	}

	private void EditUserByAdmin(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException 
	{
		 
		 u = new User();
		// u=i.updateById((Integer)session.getAttribute("uId"));
		 
		 u=i.updateById(Integer.parseInt(request.getParameter("id")));
		 grouplist = (List<Group>) i3.viewAllGroup(((Integer)session.getAttribute("uId")));
		 count=i2.countUser((Integer)session.getAttribute("uId"));	
		 request.setAttribute("count", count);
		 request.setAttribute("user", u);
		 request.setAttribute("glist", grouplist);
		 rd=request.getRequestDispatcher("./pages/login/editUserByAdmin.jsp");
         rd.forward(request, response);	
	}
	private void editgroup(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// g=i3.updateGroupById((Integer)session.getAttribute("uId"));
		 g=i3.GroupById(Integer.parseInt(request.getParameter("gid")));
		 System.out.println(g+"****");
		 grouplist = (List<Group>) i3.viewAllGroup(((Integer)session.getAttribute("uId")));
		 u=i.updateById((Integer)session.getAttribute("uId"));
		 request.setAttribute("glist", grouplist);
		 request.setAttribute("user", u);
		 request.setAttribute("group", g);
   	     rd = request.getRequestDispatcher("./pages/ui-features/editgroup.jsp");
         rd.forward(request, response); 
		
	}

	private void viewUserByAdmin(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		u= new User();
		userlist = i.viewAllUser("user");
		grouplist = i3.viewAllGroup((Integer)session.getAttribute("uId"));
		u=i.updateById((Integer)session.getAttribute("uId"));
	   // g=i3.updateGroupById((Integer)session.getAttribute("uId"));
		//g=i3.GroupById(Integer.parseInt(request.getParameter("gid")));
		
	    count=i2.countUser((Integer)session.getAttribute("uId"));
	   
		request.setAttribute("count", count);
	    request.setAttribute("userlist", userlist);
	    request.setAttribute("glist", grouplist);
	    request.setAttribute("user", u);
	   // request.setAttribute("group", g);
	    rd=request.getRequestDispatcher("./viewUserByAdmin.jsp");
	    rd.forward(request, response);
		
	}

	private void updateGroup(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		g.setgId(Integer.parseInt(request.getParameter("gid")));
		g.setgName(request.getParameter("gname"));
		i3.save(g);
		userToDesktop(request, response);
		
	}

	private void addContectInGroup(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		u=new User();
		g = new Group();
		Comman c = new Comman();
		Integer flag=0;
		commanlist= i3.commanlist(Integer.parseInt(request.getParameter("gid")),(Integer)session.getAttribute("uId"));
		String cheakconlist[]=request.getParameterValues("contect");
		Integer conid=null;
		if(cheakconlist!=null) 
		{
			for(int i =0;i<cheakconlist.length;i++) 
			{   
				conid=Integer.parseInt(cheakconlist[i]);
			 if(i3.isExistContect((Integer)session.getAttribute("uId"), Integer.parseInt(request.getParameter("gid"))).equals(conid)) {
			
				 System.out.println("this no already exist in group");
			 }	
			 else 
			 {
				 i3.CheakContectToAddGroup(conid, (Integer)session.getAttribute("uId"),Integer.parseInt(request.getParameter("gid")));
				
			 }
			}
		}
		commanlist=i3.commanlist(Integer.parseInt(request.getParameter("gid")),(Integer)session.getAttribute("uId"));
		
		viewGroupContect(request,response);

	}

	private void viewAllContectForGroup(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		u=new User();
		conlist=i1.viewAllContect((Integer)session.getAttribute("uId"));
		grouplist = i3.viewAllGroup((Integer)session.getAttribute("uId"));
		u=i.updateById((Integer)session.getAttribute("uId"));
		g = new Group();
	    g=i3.updateGroupById((Integer)session.getAttribute("uId"));
	    count=i2.countUser((Integer)session.getAttribute("uId"));
		request.setAttribute("count", count);
	    request.setAttribute("group", g);
		request.setAttribute("user", u);
		request.setAttribute("glist", grouplist);
		request.setAttribute("conlist", conlist);
		rd=request.getRequestDispatcher("./pages/ui-features/viewContecttoaddgroup.jsp");
		rd.forward(request, response);	
	}
	private void viewUserContectByAdmin(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException 
	{
		g = new Group();
		conlist = i1.viewAllContect(Integer.parseInt(request.getParameter("id")));
		grouplist = i3.viewAllGroup((Integer)session.getAttribute("uId"));
		u=i.updateById((Integer)session.getAttribute("uId"));
		g=i3.GroupById(Integer.parseInt(request.getParameter("id")));
	    count=i2.countUser((Integer)session.getAttribute("uId"));
		request.setAttribute("count", count);
	    request.setAttribute("group", g);
		request.setAttribute("user", u);
		request.setAttribute("glist", grouplist);
		request.setAttribute("conlist", conlist);
		rd=request.getRequestDispatcher("./viewUserContectByAdmin.jsp");
        rd.forward(request, response);	
	}

	private void viewGroupContect(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		u=new User();
		g = new Group();
		g=i3.GroupById(Integer.parseInt(request.getParameter("gid")));
		grouplist = (List<Group>) i3.viewAllGroup(((Integer)session.getAttribute("uId")));
		conlist = i3.GlistContect((Integer)session.getAttribute("uId"),Integer.parseInt(request.getParameter("gid")) );
		u=i.updateById((Integer)session.getAttribute("uId"));
		count=i2.countUser((Integer)session.getAttribute("uId"));
		request.setAttribute("count", count);
		request.setAttribute("group", g);
		request.setAttribute("glist", grouplist);
		request.setAttribute("user", u);
		request.setAttribute("conlist", conlist);
		rd = request.getRequestDispatcher("./pages/ui-features/viewplan.jsp");
        rd.forward(request, response);
		
	}

	
	
	private void viewGroup(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException 
	{
		u=new User();
		g=new Group();
		grouplist = i3.viewAllGroup((Integer)session.getAttribute("uId"));
		u=i.updateById((Integer)session.getAttribute("uId"));
		request.setAttribute("glist", grouplist);
		request.setAttribute("user", u);
		rd = request.getRequestDispatcher("./pages/ui-features/viewplan.jsp");
        rd.forward(request, response);
	}

	 
	private void viewContect(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		u = new User();
		conlist=i1.viewAllContect((Integer)session.getAttribute("uId"));
		grouplist = i3.viewAllGroup((Integer)session.getAttribute("uId"));
		u=i.updateById((Integer)session.getAttribute("uId"));
		count=i2.countUser((Integer)session.getAttribute("uId"));
		Integer concount=i1.TotalContect((Integer)session.getAttribute("uId"));
	    request.setAttribute("con", concount);
		request.setAttribute("count", count);
		request.setAttribute("user", u);
		request.setAttribute("glist", grouplist);
		request.setAttribute("conlist", conlist);
		rd=request.getRequestDispatcher("./pages/ui-features/viewapp.jsp");
		rd.forward(request, response);
		
	}
	private void userToDesktop(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException 
	{
		u=new User();
		u=i.updateById((Integer)session.getAttribute("uId"));
		grouplist = i3.viewAllGroup((Integer)session.getAttribute("uId"));
		count=i2.countUser((Integer)session.getAttribute("uId"));
		request.setAttribute("user", u);
		request.setAttribute("count", count);	
		request.setAttribute("glist", grouplist);
		rd=request.getRequestDispatcher("./UserDesboard1.jsp");
		//rd=request.getRequestDispatcher("./AddUserByAdmin.jsp");
		
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
