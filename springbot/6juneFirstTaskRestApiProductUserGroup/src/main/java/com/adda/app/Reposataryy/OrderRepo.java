package com.adda.app.Reposataryy;

import org.springframework.data.jpa.repository.JpaRepository;

import com.adda.app.Entity.OrderForProduct;

public interface OrderRepo extends JpaRepository<OrderForProduct, Integer> {

}
