package com.adda.app.Service;

import java.util.List;

import com.adda.app.Entity.OrderForProduct;

public interface OrderService {

  public List<OrderForProduct>listOrderForProduct();
  public OrderForProduct viewOrder(Integer id);
  public OrderForProduct updateOrder(OrderForProduct ofp,Integer id);
}
