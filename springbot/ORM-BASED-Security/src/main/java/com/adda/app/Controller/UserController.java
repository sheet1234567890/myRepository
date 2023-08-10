package com.adda.app.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.adda.app.Entity.User;
import com.adda.app.UserService.IUserService;

@Controller
@RequestMapping("/user")
public class UserController {

	@Autowired
	private IUserService uservice;
	
	/**User Registration....*/
	@GetMapping("/register")
	public String showReq() 
	{
		return "UserRagister";
	}
	
	@PostMapping("/save")
	public String saveUser(@ModelAttribute User user,Model model) 
	{
		Integer id = uservice.saveUser(user);
		String message ="User"  + 	id +  "created!";
		model.addAttribute("message", message);
		return "UserRagister";
	}
}
