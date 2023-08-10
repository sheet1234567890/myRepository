package com.adda.app.Controller;

import java.util.Optional;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.adda.app.Bean.Employee;
import com.adda.app.repo.Emprepo;

@Controller
public class EmpController {
	@Autowired
    private Emprepo erepo;
	
	
	@GetMapping("/")
	public String homePage(Model model) 
	{
		model.addAttribute("Emplist", erepo.findAll());
		return "home";
	}
	
	@GetMapping("/saveEmployee")
	public String  saveEmployeePage() 
	{
		
		return "add_Emp";
		
	}
	
	@PostMapping("/Add")
	public String addEmp(@ModelAttribute("emp") Employee  emp,Model model ,HttpSession session) {
		System.out.println(emp);
		this.erepo.save(emp);
		model.addAttribute("Emplist", erepo.findAll());
        session.setAttribute("msg", "SuccessFull Add Employee");
		return "home";

}
	@GetMapping("/edit/{id}")
	public String editEmp(@PathVariable("id") Integer id,Model  model) 
	{
		Optional<Employee> e =erepo.findById(id);
		model.addAttribute("employee", e.get());	
		return "update";
	}
	@PostMapping("/toedit")
	public String updateEmp(Model model,HttpSession session,@ModelAttribute("emp") Employee emp) 
	
	{   
		this.erepo.save(emp);
		session.setAttribute("msg", "SuccessFull Update Employee");
		model.addAttribute("Emplist", erepo.findAll());
		return "home";
	}
	
	@GetMapping("/delete/{id}")
	public String deleteEmp(Model model , @PathVariable("id")  Integer id,HttpSession session) 
	{
		
		 erepo.deleteById(id);
	      model.addAttribute("Emplist", erepo.findAll());
		  session.setAttribute("msg", "SuccessFull Delete Employee");
		return "home";

	}
	
	     
	     
	    
	}
