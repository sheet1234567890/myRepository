package com.adda.app.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.adda.app.Bean.User;
@Repository
public interface Ureposatary extends JpaRepository<User, Integer> {

}
