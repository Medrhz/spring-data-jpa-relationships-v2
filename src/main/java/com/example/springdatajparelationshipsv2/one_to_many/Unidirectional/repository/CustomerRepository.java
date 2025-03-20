package com.example.springdatajparelationshipsv2.one_to_many.Unidirectional.repository;


import com.example.springdatajparelationshipsv2.one_to_many.Unidirectional.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
