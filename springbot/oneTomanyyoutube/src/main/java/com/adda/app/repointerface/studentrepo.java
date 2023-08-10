package com.adda.app.repointerface;

import org.springframework.data.jpa.repository.JpaRepository;

import com.adda.app.bean.Studentonetomany;

public interface studentrepo extends JpaRepository<Studentonetomany, Integer> {

}
