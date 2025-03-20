package com.example.springdatajparelationshipsv2.many_to_many.Unidirectional.repository;

import com.example.springdatajparelationshipsv2.many_to_many.Unidirectional.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
