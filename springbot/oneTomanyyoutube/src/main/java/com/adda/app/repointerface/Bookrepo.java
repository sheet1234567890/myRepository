package com.adda.app.repointerface;

import org.springframework.data.jpa.repository.JpaRepository;

import com.adda.app.bean.Bookonetomany;

public interface Bookrepo extends JpaRepository<Bookonetomany, Integer> {

	
}
