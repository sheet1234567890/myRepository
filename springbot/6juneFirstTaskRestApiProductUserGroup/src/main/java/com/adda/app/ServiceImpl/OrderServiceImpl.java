package com.adda.app.ServiceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.adda.app.Entity.OrderForProduct;
import com.adda.app.MyDuplicateEmailException.ProductNotFound;
import com.adda.app.Reposataryy.OrderRepo;
import com.adda.app.Service.OrderService;
@Service
public class OrderServiceImpl implements OrderService {
@Autowired
	private OrderRepo ofp;
	 
	@Override
	public List<OrderForProduct> listOrderForProduct() {
		
		return ofp.findAll() ;
	}

	@Override
	public OrderForProduct viewOrder(Integer id) {
		Optional<OrderForProduct>o=ofp.findById(id);
		OrderForProduct o1 = null;
		if(o.isPresent()) 
		{
			o1=o.get();
		}
		return o1;
	}

	@Override
	public OrderForProduct updateOrder(OrderForProduct ofp1 ,Integer id) {
		
		if(ofp.existsById(id) ){
		
			//ofp1.setOid(id);
		return ofp.save(ofp1);
		}
		else 
		{
		throw new ProductNotFound("order not found");	
		}
		}
		

}
