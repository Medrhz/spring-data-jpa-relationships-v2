package com.example.springdatajparelationshipsv2.one_to_many.bidirectional.entity;

import jakarta.persistence.*;
import lombok.*;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name = "orders")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long orderId;
    private String product;
    private Double price;

    @ManyToOne
    @JoinColumn(name = "customer_id")  // bidirectional
    private Customer customer;

    public Order (String product, Double price) {
        this.product = product;
        this.price = price;
    }
}
