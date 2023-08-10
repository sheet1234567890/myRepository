package com.adda.app.Reposatary;

import org.springframework.data.jpa.repository.JpaRepository;

import com.adda.app.Entity.Course;

public interface CourseRepo extends JpaRepository<Course, Integer> {

}
