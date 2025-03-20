package com.example.springdatajparelationshipsv2.one_to_many.Unidirectional.repository;


import com.example.springdatajparelationshipsv2.one_to_many.Unidirectional.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {


}
