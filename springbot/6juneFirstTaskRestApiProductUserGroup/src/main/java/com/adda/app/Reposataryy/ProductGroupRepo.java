package com.adda.app.Reposataryy;

import org.springframework.data.jpa.repository.JpaRepository;

import com.adda.app.Entity.ProductGroup;

public interface ProductGroupRepo extends JpaRepository<ProductGroup, Integer> {

}
