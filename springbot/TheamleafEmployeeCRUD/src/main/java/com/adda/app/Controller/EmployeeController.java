package com.adda.app.Controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.adda.app.Bean.Employee;
import com.adda.app.Service.EmpService;

@Controller
public class EmployeeController {
	@Autowired
	private EmpService eserv;
	
	
	
//List Of Employees
	@GetMapping("/")
	public String ShowHomePage(Model model) 
	{
             
		return paging(1, model,"empid" ,"asc");
	}
	
	
	//Delete Employee
	@GetMapping("/delete/{id}")
	public String deleteEmployee(@PathVariable ("id") int id,Model model,HttpSession session) 
	{
		eserv.deleteEmployee(id);
		return ShowHomePage(model);
		
	}
	
	
	// ADD EMPLOYEE
	@GetMapping("/show")
	public String EmployeeForm(Model model) 
	{
		Employee employee = new Employee();
		model.addAttribute("emp", employee);
		return "new_Empadd";
	}
	
	@PostMapping("/save")
	public String saveEmployee(@ModelAttribute("emp") Employee emp,Model model) 
	{
		System.out.println(emp);
		this.eserv.SaveEmployee(emp);	
		return ShowHomePage(model);
	
	}
	
	//EDIT EMPLOYEE
	@GetMapping("/edit/{id}")
	public String editEmp(@PathVariable("id") int id,Model model) 
	{
		Employee employee = this.eserv.editEmployee(id);
		model.addAttribute("emp", employee);
		return "edit_emp";
		
	}
	
	
	//Pagination and Sorting
	
	@GetMapping("/page/{pageno}")
	public String paging(@PathVariable ("pageno") int pageno,Model model ,
			@RequestParam("sortField") String sortField,
			@RequestParam("sortDir")String sortDir) 
			
	{
		int pageSize =5;
		Page<Employee> page = this.eserv.findpaginated(pageno, pageSize,sortField,sortDir);
		List<Employee> Emplist =page.getContent();
		
		model.addAttribute("totalpage", page.getTotalPages());
		model.addAttribute("totalitem", page.getTotalElements());
		model.addAttribute("currentpage", pageno);
		
		
		model.addAttribute("sortField", sortField);
		model.addAttribute("sortDir", sortDir);
		model.addAttribute("reverseSorting", sortDir.equals("asc")?"desc":"asc");
		
		model.addAttribute("emplist", Emplist);
		
		return "home";
	}
	@GetMapping("/s")
	public String toSearch(Model model,@Param("keyword") String keyword) 
	{
		System.out.println(keyword+"****");
		System.out.println("sheetal");
		List <Employee>emplist = eserv.listAll(keyword);
		System.out.println(emplist+"******");
		model.addAttribute("emplist", emplist);
		model.addAttribute("keyword", keyword);
		return "home";
		
	}
	
}
