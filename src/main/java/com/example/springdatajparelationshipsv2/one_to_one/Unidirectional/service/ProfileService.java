package com.example.springdatajparelationshipsv2.one_to_one.Unidirectional.service;

import com.example.springdatajparelationshipsv2.one_to_one.Unidirectional.entity.Profile;
import com.example.springdatajparelationshipsv2.one_to_one.Unidirectional.repository.ProfileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProfileService {
    @Autowired
    private ProfileRepository profileRepository;

    public Profile createUser (Profile profile) {
        return this.profileRepository.save(profile);
    }

    public List<Profile> getProfiles () {
        List<Profile> profileList = this.profileRepository.findAll();
        return profileList;
    }
}
