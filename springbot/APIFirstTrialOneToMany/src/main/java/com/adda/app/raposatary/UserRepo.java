package com.adda.app.raposatary;

import org.springframework.data.jpa.repository.JpaRepository;

import com.adda.app.Bean.User;

public interface UserRepo extends JpaRepository<User, Integer> {

}
