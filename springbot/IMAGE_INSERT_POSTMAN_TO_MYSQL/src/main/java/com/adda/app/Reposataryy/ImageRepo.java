package com.adda.app.Reposataryy;

import org.springframework.data.jpa.repository.JpaRepository;

import com.adda.app.Entity.ImageEntity;

public interface ImageRepo extends JpaRepository<ImageEntity, Integer> {

}
