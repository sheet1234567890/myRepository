package com.adda.app.reposatary;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.adda.app.Entity.ImageData;

public interface StorageRepo extends JpaRepository<ImageData, Long> {

	Optional<ImageData> findByName(String filename);
}
