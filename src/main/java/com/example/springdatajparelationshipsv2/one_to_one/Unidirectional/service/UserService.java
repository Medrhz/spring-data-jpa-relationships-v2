package com.example.springdatajparelationshipsv2.one_to_one.Unidirectional.service;

import com.example.springdatajparelationshipsv2.one_to_one.Unidirectional.entity.User;
import com.example.springdatajparelationshipsv2.one_to_one.Unidirectional.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User createUser (User user) {
        return this.userRepository.save(user);
    }

    public List<User> createUsers (List<User> users) {
        return this.userRepository.saveAll(users);
    }

    public List<User> getUsers () {
        return this.userRepository.findAll();
    }

    public User getUser (Long id) {
        return this.userRepository.findById(id).get();
    }

    public User deleteUser (Long id) {
        User user = this.userRepository.findById(id).get();
        boolean isFind, isDeleted = false;
        if (user != null) {
            isFind = true;
            this.userRepository.delete(user);
            isDeleted = true;
            return user;
        } else {
            System.out.println("user not found !");
            return null;
        }
    }

    public void deleteUsers () {
        this.userRepository.deleteAll();
        System.out.println("all users are deleted");
    }

}
