package com.adda.app.Repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.adda.app.Bean.Product;

public interface productrepo extends JpaRepository<Product, Integer> {

@Query("select p from Product p left join Vender v on p.Vender = v.vid")
	List<Product> getProductAll();
}
