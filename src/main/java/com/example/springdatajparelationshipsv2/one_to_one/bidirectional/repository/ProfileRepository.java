package com.example.springdatajparelationshipsv2.one_to_one.bidirectional.repository;

import com.example.springdatajparelationshipsv2.one_to_one.bidirectional.entity.Profile;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProfileRepository extends JpaRepository<Profile, Long> {
}
