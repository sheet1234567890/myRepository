package com.adda.app.raposatary;

import org.springframework.data.jpa.repository.JpaRepository;

import com.adda.app.Bean.Role;

public interface Rolerepo extends JpaRepository<Role, Integer> {

}
