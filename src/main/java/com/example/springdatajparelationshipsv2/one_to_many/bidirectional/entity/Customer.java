package com.example.springdatajparelationshipsv2.one_to_many.bidirectional.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name = "customers")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private String city;
    private String phoneNumber;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY, mappedBy = "customer")
    private List<Order> orders;


    public Customer (String firstName, String lastName, String email, String address, String phoneNumber, List<Order> orders) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.city = address;
        this.phoneNumber = phoneNumber;
        this.orders = orders;
    }
}
