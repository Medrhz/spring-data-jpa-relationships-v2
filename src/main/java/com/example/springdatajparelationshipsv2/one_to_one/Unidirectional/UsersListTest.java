//package com.example.springdatajparelationshipsv2.one_to_one.Unidirectional;
//
//import com.example.springdatajparelationshipsv2.one_to_one.Unidirectional.entity.Profile;
//import com.example.springdatajparelationshipsv2.one_to_one.Unidirectional.entity.User;
//import com.example.springdatajparelationshipsv2.one_to_one.Unidirectional.service.ProfileService;
//import com.example.springdatajparelationshipsv2.one_to_one.Unidirectional.service.UserService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//
//import java.util.List;
//
//@SpringBootApplication
//public class UsersListTest implements CommandLineRunner {
//    @Autowired
//    private UserService userService;
//    @Autowired
//    private ProfileService profileService;
//
//    public static void main (String[] args) {
//        SpringApplication.run(UsersListTest.class);
//    }
//
//    @Override
//    public void run (String... args) throws Exception {
//
//        List<User> userList = this.userService.getUsers();
//        List<Profile> profileList = this.profileService.getProfiles();
//        System.out.println(" =====  users list ===== ");
//        for (User user1 : userList) {
//            System.out.println("id : " + user1.getId());
//            System.out.println("username: " + user1.getUserName());
//            System.out.println("email : " + user1.getEmail());
//            if (user1.getProfile() != null) {
//                System.out.println(user1.getProfile().getBio());
//            }
//            System.out.println("-------------------------------------");
//        }
//        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++");
//        System.out.println(" =====  profile list ===== ");
//        for (Profile profile : profileList) {
//            System.out.println("id : " + profile.getId());
//            System.out.println("bio: " + profile.getBio());
//            System.out.println("-------------------------------------");
//        }
//    }
//}
