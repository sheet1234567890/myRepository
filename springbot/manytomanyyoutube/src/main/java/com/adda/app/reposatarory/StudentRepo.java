package com.adda.app.reposatarory;

import org.springframework.data.jpa.repository.JpaRepository;

import com.adda.app.bean.StudentMtoM;

public interface StudentRepo extends JpaRepository<StudentMtoM, Integer> {

}
