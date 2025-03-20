package com.example.springdatajparelationshipsv2.one_to_one.bidirectional;


import com.example.springdatajparelationshipsv2.one_to_one.bidirectional.entity.Profile;
import com.example.springdatajparelationshipsv2.one_to_one.bidirectional.entity.User;
import com.example.springdatajparelationshipsv2.one_to_one.bidirectional.service.ProfileService;
import com.example.springdatajparelationshipsv2.one_to_one.bidirectional.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AddUserTest implements CommandLineRunner {
    @Autowired
    private UserService userService;
    @Autowired
    private ProfileService profileService;

    public static void main (String[] args) {
        SpringApplication.run(AddUserTest.class, args);
    }

    @Override
    public void run (String... args) throws Exception {
        Profile profile = new Profile("Profile Description");
        User user = new User("john_doe3", "john3@example.com", "password123", profile);
        System.out.println(this.userService.createUser(user));
    }
}
