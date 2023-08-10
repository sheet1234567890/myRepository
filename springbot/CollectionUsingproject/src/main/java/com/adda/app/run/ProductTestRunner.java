package com.adda.app.run;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.adda.app.Bean.Product;
import com.adda.app.Reposatary.ProductRepo;
@Component
public class ProductTestRunner implements CommandLineRunner {
   @Autowired
	private ProductRepo repo;
	@Override
	public void run(String... args) throws Exception {
		
		Product pob = new Product();
		pob.setProdId(10);
		pob.setProdCode("PEN");
		pob.setColour(Arrays.asList("RE","GR","BL"));
		//pob.setColour(List.of("RE","GR","BL");
		Set<String>set = new LinkedHashSet<>();
		set.add("M1");
		set.add("LA");
		set.add("SF");
		pob.setModules(set);
		Map<String,String>map = new LinkedHashMap<>();
		map.put("D1","ABC" );
		map.put("D2", "XYZ");
		pob.setDetails(map);
		repo.save(pob);
	}

}
