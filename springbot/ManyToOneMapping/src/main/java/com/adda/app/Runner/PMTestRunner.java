package com.adda.app.Runner;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.adda.app.Bean.Model;
import com.adda.app.Bean.Product;
import com.adda.app.DAO.ProductRepo;
@Component
public class PMTestRunner implements CommandLineRunner {
    @Autowired
	private ProductRepo repo;
	@Override
	public void run(String... args) throws Exception {
    
		Product p = new Product();
		p.setPCode("ABC");
		p.setPId(1);
		Model m1 = new Model(1,"A","java");
		Model m2 = new Model(2,"B","python");
		List l = new ArrayList();
		l.add(m1);
		l.add(m2);
		p.setModelList(l);
       repo.save(p);
	}

}
