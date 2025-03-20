package com.example.springdatajparelationshipsv2.many_to_many.bidirectional.repository;

import com.example.springdatajparelationshipsv2.many_to_many.bidirectional.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Long> {
}
