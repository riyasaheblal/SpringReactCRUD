package com.spring.react.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.react.model.Course;

@Repository
public interface CourseRepo extends JpaRepository<Course, Integer> {

}
