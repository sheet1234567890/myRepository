package com.adda.app.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import com.adda.app.Bean.User;

@Controller
//@RequestMapping("/user")
public class UserController {
	/*
@GetMapping("/home")
	public String showhomePage() 
	{
		return "UserHome";
	}
*/
@GetMapping("/info")
public String showUserPage(
		ModelMap model
		) 
{
	model.addAttribute("uname", "Sheetal");
	model.addAttribute("cname", "Java");
	return "UserHome";
}

@GetMapping("/obj")
  public String showUserObject(Model model) 
  {
	  User user = new User(10,"sheetal","JAVA DEVOLOPER");
	  model.addAttribute("obj", user);
	  List<User>list=Arrays.asList(
			  new User(11,"surbhi","Python"),
	       	  new User(12,"ishwari", "Java"),
	       	  new User(13,"surbhi","Python"),
	       	  new User(14,"minakshi", "bcom")
			  );
	  model.addAttribute("listobj", list);
	  return "UserData";
  }

}
