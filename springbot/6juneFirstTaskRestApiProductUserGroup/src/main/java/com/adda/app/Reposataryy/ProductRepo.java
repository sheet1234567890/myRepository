package com.adda.app.Reposataryy;

import org.springframework.data.jpa.repository.JpaRepository;

import com.adda.app.Entity.Product;

public interface ProductRepo extends JpaRepository<Product, Integer>{

}
