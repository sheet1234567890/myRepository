package com.adda.app.Reposatary;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.adda.app.IEntity.ImageData;

public interface StorageRepository extends JpaRepository<ImageData, Long> {

  Optional<ImageData> findByName(String fileName);
	
}
