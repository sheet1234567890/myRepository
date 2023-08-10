package com.adda.app.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.adda.app.Bean.Product;

public interface IProductrepo extends JpaRepository<Product, Integer>{

}
