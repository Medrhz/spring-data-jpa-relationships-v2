package com.example.springdatajparelationshipsv2.one_to_one.bidirectional.entity;


import jakarta.persistence.*;
import lombok.*;


@Entity
@Table(name = "users")
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Getter
@Setter
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String userName;
    private String email;
    private String password;

    @OneToOne(cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "profile_id")
    private Profile profile;

    public User (String userName, String email, String password, Profile profile) {
        this.userName = userName;
        this.email = email;
        this.password = password;
        this.profile = profile;
    }

    @Override
    public String toString () {
        return "User{" + "id=" + this.id + ", userName='" + this.userName + '\'' + ", email='" + this.email + '\'' + ", password='" + this.password + '\'' + ", profile=" + this.profile.getBio() + '}';
    }
}
