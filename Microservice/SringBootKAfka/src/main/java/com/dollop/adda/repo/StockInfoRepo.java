package com.dollop.adda.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dollop.adda.entity.StockInfo;

public interface StockInfoRepo extends JpaRepository<StockInfo, Integer> {

}
