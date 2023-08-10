package com.adda.app.Reposatary;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.adda.app.Entity.User;

public interface UserRepo extends JpaRepository<User, Integer> {

	
	Optional<User> findByUserEmail(String UserEmail);
}
