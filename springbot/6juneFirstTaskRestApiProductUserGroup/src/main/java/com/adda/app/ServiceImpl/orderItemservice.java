package com.adda.app.ServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.adda.app.Entity.orderItem;
import com.adda.app.Reposataryy.OrderItemRepo;
@Service
public class orderItemservice implements com.adda.app.Service.orderItemservice {

	@Autowired
	private OrderItemRepo oirepo;
	@Override
	public orderItem CreateOrderItem(orderItem o) {
	return	oirepo.save(o);
	}
	

}
