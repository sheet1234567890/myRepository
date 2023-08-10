package com.adda.app.Runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.adda.app.Bean.Product;
import com.adda.app.Bean.Vender;
import com.adda.app.repo.IProductrepo;
import com.adda.app.repo.IVenderrepo;
@Component
public class TestRunner implements CommandLineRunner {
     @Autowired
	 private IProductrepo prepo;
     @Autowired
	 private IVenderrepo vrepo;
	@Override
	 public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Vender v = new Vender();
		v.setVid(1);
		v.setVname("sheetal");
		Product p = new Product();
		p.setPid(1);
		p.setPcode("A");
		p.setVid(v);
		//prepo.save(p);
		vrepo.save(v);
	}

}
