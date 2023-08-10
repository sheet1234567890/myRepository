package com.adda.app.Controller;

import java.io.IOException;
import java.util.List;

import com.adda.app.Bean.Employee;
import com.adda.app.DAO.IEmpInterface;
import com.adda.app.DAO.impl.EmpInterfaceimpl;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class EmpController
 */
public class EmpController extends HttpServlet {
	private static final long serialVersionUID = 1L;
  private IEmpInterface I = new EmpInterfaceimpl();
  private Employee employee= null;
  private RequestDispatcher rd = null;
  List<Employee>viewAllEmployee=null;
    /**
     * Default constructor. 
     */
    public EmpController() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action = request.getParameter("action");
		switch(action) 
		{
		case "ADDEMP":
			employee = new Employee();
			if(request.getParameter("eid")!=null) 
				employee.setE_id(Integer.parseInt(request.getParameter("eid")));
			    employee.setE_name(request.getParameter("ename"));
			    employee.setE_sal(Double.parseDouble(request.getParameter("esal")));
			    employee.setE_depart(request.getParameter("edepartment"));
			    I.save(employee);
			    viewAllEmployee = I.viewAllEmployee();
				request.setAttribute("viewAllEmployee", viewAllEmployee);
				rd=request.getRequestDispatcher("./index.jsp");
				rd.forward(request, response);
		break;
		case "VIEWEMP":
			viewAllEmployee = I.viewAllEmployee();
			request.setAttribute("viewAllEmployee", viewAllEmployee);
			rd=request.getRequestDispatcher("./viewEmp.jsp");
			rd.forward(request, response);
			break;
		case "DELETEEMP":
			I.deleteEmployeeById(Integer.parseInt(request.getParameter("eid")));
			viewAllEmployee = I.viewAllEmployee();
			request.setAttribute("viewAllEmployee", viewAllEmployee);
			rd=request.getRequestDispatcher("./viewEmp.jsp");
			rd.forward(request, response);
			break;
			
		case "UPDATEEMP":
			Employee EmpByID=null;
			EmpByID=I.updateByIdEmployee(Integer.parseInt(request.getParameter("eid")));
			request.setAttribute("EmpByID", EmpByID);
			rd=request.getRequestDispatcher("./editEmp.jsp");
			rd.forward(request, response);
			break;
		default:
			break;
 
		}
	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
