package com.adda.app.Service;

import java.util.List;

import com.adda.app.Entity.ProductGroup;

public interface ProductGroupService  {

	public ProductGroup saveProductGroup(ProductGroup pg);
	public List<ProductGroup> listOfGroup();
	public ProductGroup GroupById(Integer id);
	public ProductGroup updateGroup(Integer id,ProductGroup productgroup);
}
