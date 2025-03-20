package com.example.springdatajparelationshipsv2.one_to_many.Unidirectional.entity;

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

    public Order (String product, Double price) {
        this.product = product;
        this.price = price;
    }
}
