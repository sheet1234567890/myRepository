package com.adda.app.Reposatary;

import org.springframework.data.jpa.repository.JpaRepository;

import com.adda.app.Entity.Address;

public interface AddRepo extends JpaRepository<Address, Integer> {

}
