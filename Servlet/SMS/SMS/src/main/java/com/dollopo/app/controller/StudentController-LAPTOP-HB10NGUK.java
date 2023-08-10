package com.dollopo.app.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.Iterator;
import java.util.List;

import com.dollop.app.bean.Student;
import com.dollop.app.dao.StudentDAOInterface;
import com.dollop.app.dao.impl.StudentDAOImpl;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class StudentController
 */
public class StudentController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private StudentDAOInterface std=new StudentDAOImpl();
	RequestDispatcher rd=null;
	List<Student> viewAllStudents=null;

    /**
     * Default constructor. 
     */
    public StudentController() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action=request.getParameter("action");
		switch (action) {
		case "ADDSTUDENT":
			Student student=new Student();
			if(request.getParameter("sid")!=null)
			student.setSid(Integer.parseInt(request.getParameter("sid")));
			student.setSname(request.getParameter("sname"));
			student.setSemail(request.getParameter("semail"));
			student.setSmobile(request.getParameter("smobile"));
			student.setSaddress(request.getParameter("saddress"));
			try {
				if (std.save(student)) {
					System.out.println("ADD 1 Student");
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			paginat(request,response);
			/*
			 * viewAllStudents = std.viewAllStudents();
			 * request.setAttribute("viewAllStudents", viewAllStudents);
			 * rd=request.getRequestDispatcher("./index.jsp"); rd.forward(request,
			 * response);
			 */
			break;
		case "VIEWSTUDENTS":
			 viewAllStudents = std.viewAllStudents();
			request.setAttribute("viewAllStudents", viewAllStudents);
			 rd=request.getRequestDispatcher("./viewstudent.jsp");
			rd.forward(request, response);
			break;
		case "DELETESTUDENT":
			  try {
				std.deleteById(Integer.parseInt(request.getParameter("id")));
			} catch (NumberFormatException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			/*
			 * viewAllStudents = std.viewAllStudents();
			 * 
			 * request.setAttribute("viewAllStudents", viewAllStudents);
			 * rd=request.getRequestDispatcher("./viewstudent.jsp"); rd.forward(request,
			 * response);
			 */
			  paginat(request,response);
				break;
		case "UPDATESTUDENT":
			Student studentById =null;
			System.out.println(Integer.parseInt(request.getParameter("id")));
			try {
				 studentById = std.studentById(Integer.parseInt(request.getParameter("id")));
			} catch (NumberFormatException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			paginat(request,response);
			/*
			 * request.setAttribute("studentById", studentById);
			 * rd=request.getRequestDispatcher("./edit.jsp"); rd.forward(request, response);
			 */
			break;
		case"PAGINATION":
			paginat(request,response);
			/*
			 * out.print("<h1>Page No :"+spageid+"</h1>");
			 * out.print("<table border='1' cellpadding='4' width='60%'>"); out.print(
			 * "<tr><th>Name</th><th>Email</th><th>Mobile</th><th>Address</th></tr>");
			 * for(Student stu:list) {
			 * out.print("<tr><td>"+stu.getSname()+"</td><td>"+stu.getSemail()+"</td><td>"+
			 * stu.getSmobile()+"</td><td>"+stu.getSaddress()+"</td></tr>");
			 * 
			 * } out.print("</table>"); out.print("");
			 * 
			 */			
			break;
			default:
			break;
		}
	}

	private void paginat(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	
		String spageid=request.getParameter("page");
		
		
		Integer pageid=Integer.parseInt(spageid);
		int total = 5;
		System.out.println(pageid);
		if(pageid==1) 
		{
			
		}
		else 
		{
			pageid=pageid-1;
			pageid=pageid*total+1;
			
		}
		List<Student>list=std.getRecords(pageid, total);
		Integer totalro = std.totalrow();
		Integer totalpage=0;
		System.out.println(totalro+"row");
		System.out.println(list);
		if(totalro/total==0) {
		 totalpage = (totalro/total);
		}
		else 
		{
			 totalpage = (totalro/total)+1;	
		}
		System.out.println(totalpage+"page");
		request.setAttribute("totalpage",totalpage);
		request.setAttribute("totalrow", totalro);
		request.setAttribute("page",pageid );
		request.setAttribute("list", list);
		rd=request.getRequestDispatcher("./viewstudent.jsp");
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
