package com.adda.app.Reposataryy;

import org.springframework.data.jpa.repository.JpaRepository;

import com.adda.app.Entity.orderItem;

public interface OrderItemRepo extends JpaRepository<orderItem, Integer> {

}
