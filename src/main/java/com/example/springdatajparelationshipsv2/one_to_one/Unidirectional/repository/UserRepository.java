package com.example.springdatajparelationshipsv2.one_to_one.Unidirectional.repository;

import com.example.springdatajparelationshipsv2.one_to_one.Unidirectional.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
