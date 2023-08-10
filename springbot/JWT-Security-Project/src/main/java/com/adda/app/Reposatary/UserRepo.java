package com.adda.app.Reposatary;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.adda.app.entity.User;

public interface UserRepo extends JpaRepository<User, Integer> {
	
	Optional<User> findByUsername(String username);

}
