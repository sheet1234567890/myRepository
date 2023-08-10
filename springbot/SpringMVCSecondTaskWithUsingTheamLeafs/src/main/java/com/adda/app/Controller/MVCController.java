package com.adda.app.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MVCController {
	@GetMapping("/data")
	public String showData(Model model) 
	{
		model.addAttribute("prodCode", "SAMPLE ABCD!");
		return "productData";
	}

}
