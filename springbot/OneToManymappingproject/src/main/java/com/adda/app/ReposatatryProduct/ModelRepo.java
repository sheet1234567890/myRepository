package com.adda.app.ReposatatryProduct;

import org.springframework.data.jpa.repository.JpaRepository;

import com.adda.app.Bean.Model;

public interface ModelRepo extends JpaRepository<Model, Integer> {

}
