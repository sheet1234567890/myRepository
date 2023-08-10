package com.adda.app.ServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.adda.app.Entity.Company;
import com.adda.app.Exceptions.DuplicateComapnyNameException;
import com.adda.app.Reposataryy.IRCompanyRepo;
import com.adda.app.Service.ICompanyService;
@Service
public class CompanyServiceImpl implements ICompanyService {
   @Autowired
	private IRCompanyRepo crepo;
	@Override
	/**Create Company....*/
	public Company CreateCompany(Company company) {
		Integer id = crepo.getCompany(company.getCompanyname());
		System.out.println(id);
		
		if(id==null) 
		{
			
			return  crepo.save(company);
			
		}
		else 
			throw new DuplicateComapnyNameException("This Company Name Already Exist plz Create New Name Company");
	}

}
