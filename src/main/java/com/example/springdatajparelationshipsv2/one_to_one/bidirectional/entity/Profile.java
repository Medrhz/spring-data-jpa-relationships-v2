package com.example.springdatajparelationshipsv2.one_to_one.bidirectional.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "profiles")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Profile {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String bio;

    // mapped by attribute Profile in user class
    // we add mapped by in the class
    @OneToOne(mappedBy = "profile")
    private User user;

    public Profile (String bio) {
        this.bio = bio;
    }

    @Override
    public String toString () {
        return "Profile{" + "id=" + this.id + ", bio='" + this.bio + '\'' + ", user=" + this.user.getUserName() + '}';
    }


}
