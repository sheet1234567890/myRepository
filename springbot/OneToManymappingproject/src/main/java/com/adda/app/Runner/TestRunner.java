package com.adda.app.Runner;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.adda.app.Bean.Model;
import com.adda.app.Bean.Product;
import com.adda.app.ReposatatryProduct.ProductRepo;
@Component
public class TestRunner implements CommandLineRunner {
    @Autowired
	private ProductRepo prepo;
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
   System.out.println("sheetal patidar");
		Product p  = new Product();
		p.setPId(1);
		p.setPCode("A");
		Model m1 = new Model(1,"AB","JAVA");
		
		List<Model>list=new ArrayList();
		
		list.add(m1);
		p.setModelList(list);
		prepo.save(p);
	}

}
