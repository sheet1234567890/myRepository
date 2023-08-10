package com.adda.app.Reposataryy;

import org.springframework.data.jpa.repository.JpaRepository;

import com.adda.app.Entity.Cart;

public interface CartRepo extends JpaRepository<Cart, Integer> {

}
