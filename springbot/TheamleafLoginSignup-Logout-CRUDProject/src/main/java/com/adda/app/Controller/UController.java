package com.adda.app.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.adda.app.Service.UService;
import com.adda.pp.userDto.UserRagistrationDto;

@Controller
@RequestMapping("/registration")
public class UController {
	
	private UService userv;

	public UController(UService userv) {
		super();
		this.userv = userv;
	}
	
	@GetMapping
	public String showragistrationform() 
	{
		return "register";
	}
	
	@PostMapping
	public String ragisterUserAccount(@ModelAttribute("user")UserRagistrationDto udto ) 
	{
		this.userv.save(udto);
		return "redirect:/ragistration?success";
	}
  
}
