package com.example.springdatajparelationshipsv2.one_to_many.bidirectional.repository;


import com.example.springdatajparelationshipsv2.one_to_many.bidirectional.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
