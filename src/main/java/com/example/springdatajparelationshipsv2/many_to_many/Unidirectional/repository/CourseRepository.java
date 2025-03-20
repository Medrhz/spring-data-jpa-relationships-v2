package com.example.springdatajparelationshipsv2.many_to_many.Unidirectional.repository;

import com.example.springdatajparelationshipsv2.many_to_many.Unidirectional.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Long> {
}
