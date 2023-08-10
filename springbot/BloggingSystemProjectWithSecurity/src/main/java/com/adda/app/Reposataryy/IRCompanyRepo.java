package com.adda.app.Reposataryy;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.adda.app.Entity.Company;

public interface IRCompanyRepo extends JpaRepository<Company, Integer> {

	@Query("Select c.companyid from Company c where companyname=:name")
	public Integer getCompany(String name) ;
}
