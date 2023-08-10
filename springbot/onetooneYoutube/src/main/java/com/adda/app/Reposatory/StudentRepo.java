package com.adda.app.Reposatory;


import org.springframework.data.jpa.repository.JpaRepository;

import com.adda.app.Bean.Studentonetoone;

public interface StudentRepo extends JpaRepository<Studentonetoone, Integer> {

}
