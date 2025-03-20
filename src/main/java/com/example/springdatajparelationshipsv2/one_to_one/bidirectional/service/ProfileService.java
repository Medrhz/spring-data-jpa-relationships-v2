package com.example.springdatajparelationshipsv2.one_to_one.bidirectional.service;

import com.example.springdatajparelationshipsv2.one_to_one.bidirectional.entity.Profile;
import com.example.springdatajparelationshipsv2.one_to_one.bidirectional.repository.ProfileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProfileService {
    @Autowired
    private ProfileRepository profileRepository;

    public Profile createUser (Profile profile) {
        return this.profileRepository.save(profile);
    }
}
