package com.adda.app.ServiceImpl;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.adda.app.Entity.ProductGroup;
import com.adda.app.MyDuplicateEmailException.GroupNotFound;
import com.adda.app.MyDuplicateEmailException.ProductNotFound;
import com.adda.app.Reposataryy.ProductGroupRepo;
import com.adda.app.Service.ProductGroupService;
@Service
public class ProductGroupServiceImpl implements ProductGroupService {
   @Autowired
	private ProductGroupRepo pgrepo;
	
	@Override
	public ProductGroup saveProductGroup(ProductGroup pg) {
		
		return pgrepo.save(pg) ;
	}

	@Override
	public List<ProductGroup> listOfGroup() {
		
		return pgrepo.findAll();
	}

	@Override
	public ProductGroup GroupById(Integer id) {
		
		Optional<ProductGroup>pg= pgrepo.findById(id);
		if(pg.isPresent()) 
		{
			return pg.get();
		}
		else 
		{
			throw new GroupNotFound("This Group Not Avalaible on the given id");
		}
	}

	@Override
	public ProductGroup updateGroup(Integer id, ProductGroup productgroup) {
		if(pgrepo.existsById(id)) 
		{
			return pgrepo.save(productgroup);
		}
		else 
		{
			throw new ProductNotFound("product Group nhi mil rha heee.......");
		}

		
	}

}
