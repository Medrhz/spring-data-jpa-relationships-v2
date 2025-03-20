package com.example.springdatajparelationshipsv2.one_to_many.Unidirectional.service;


import com.example.springdatajparelationshipsv2.one_to_many.Unidirectional.entity.Order;
import com.example.springdatajparelationshipsv2.one_to_many.Unidirectional.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {
    @Autowired
    private final OrderRepository orderRepository;

    public OrderService (OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public Order saveOrder (Order order) {
        return this.orderRepository.save(order);
    }

    public List<Order> getAllOrders () {
        return this.orderRepository.findAll();
    }
}
