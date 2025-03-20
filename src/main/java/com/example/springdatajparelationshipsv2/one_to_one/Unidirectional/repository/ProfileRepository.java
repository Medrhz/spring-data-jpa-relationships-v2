package com.example.springdatajparelationshipsv2.one_to_one.Unidirectional.repository;

import com.example.springdatajparelationshipsv2.one_to_one.Unidirectional.entity.Profile;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProfileRepository extends JpaRepository<Profile, Long> {
}
