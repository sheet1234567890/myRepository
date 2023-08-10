package com.adda.app.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.adda.app.Entity.StockInfo;

public interface StockInfoRepo extends JpaRepository<StockInfo, Integer> {

}
