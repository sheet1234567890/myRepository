package com.adda.app.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.adda.app.Bean.Product;

public interface ProductRepo extends JpaRepository<Product, Integer> {

}
