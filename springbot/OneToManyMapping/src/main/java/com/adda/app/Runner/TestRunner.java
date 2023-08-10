package com.adda.app.Runner;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

import com.adda.app.Bean.Model;
import com.adda.app.Bean.Product;
import com.adda.app.Repo.ModelRepo;
import com.adda.app.Repo.ProductRepo;
@Component

public class TestRunner implements CommandLineRunner {

	@Autowired
	private ProductRepo prepo;
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
     Product product = new Product();
     product.setPCode("abc");
      
     Model model1= new Model();
     model1.setMData("m1");
     model1.setMCode("987");
     
     Model model2= new Model();
     model2.setMData("m1");
     model2.setMCode("987");
     
     List<Model> models = new ArrayList<>();
     
     models.add(model2);
     models.add(model1);
     product.setModelList(models);
     
     prepo.save(product);
     
        
       
	}

}
