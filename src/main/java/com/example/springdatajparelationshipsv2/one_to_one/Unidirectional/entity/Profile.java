package com.example.springdatajparelationshipsv2.one_to_one.Unidirectional.entity;


import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "profiles")
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Getter
@Setter
public class Profile {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String bio;

    public Profile (String bio) {
        this.bio = bio;
    }


}
