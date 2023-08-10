package com.adda.app.Runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.adda.app.Bean.Product;
import com.adda.app.Bean.Vender;
import com.adda.app.Repo.productrepo;
import com.adda.app.Repo.venderrepo;
@Component
public class TestRunner implements CommandLineRunner {

	@Autowired
	private productrepo prepo;
	@Autowired
	private venderrepo vrepo;
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub

		
		  Vender v = new Vender(2,"sheetal"); 
		  Product p = new Product(20,102,v);
		  vrepo.save(v);
		  prepo.save(p);
		  Vender v1= new Vender(3,"vandana"); 
		  Product p1 = new Product(30,103,v1);
		  vrepo.save(v1);
		  prepo.save(p1);
		  
		 
	}

}
