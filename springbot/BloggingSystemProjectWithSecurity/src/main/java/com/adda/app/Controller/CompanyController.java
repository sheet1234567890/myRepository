package com.adda.app.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.adda.app.Entity.Company;
import com.adda.app.Service.ICompanyService;

@RequestMapping("/api/company")
@RestController
public class CompanyController {
	@Autowired
	private ICompanyService cService;

	@PostMapping("/create")
	public ResponseEntity<Company> CreateComapany(@RequestBody Company company) {
		return new ResponseEntity<Company>(cService.CreateCompany(company), HttpStatus.CREATED);
	}

}
