package com.example.springdatajparelationshipsv2.one_to_one.bidirectional.repository;

import com.example.springdatajparelationshipsv2.one_to_one.bidirectional.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
