package com.example.springdatajparelationshipsv2.one_to_many.bidirectional.repository;


import com.example.springdatajparelationshipsv2.one_to_many.bidirectional.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {


}
