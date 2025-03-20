package com.example.springdatajparelationshipsv2.one_to_one.bidirectional.service;

import com.example.springdatajparelationshipsv2.one_to_one.bidirectional.entity.User;
import com.example.springdatajparelationshipsv2.one_to_one.bidirectional.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User createUser (User user) {
        return this.userRepository.save(user);
    }
}
