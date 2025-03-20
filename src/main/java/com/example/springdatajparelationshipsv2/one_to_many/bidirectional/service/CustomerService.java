package com.example.springdatajparelationshipsv2.one_to_many.bidirectional.service;


import com.example.springdatajparelationshipsv2.one_to_many.bidirectional.entity.Customer;
import com.example.springdatajparelationshipsv2.one_to_many.bidirectional.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    public List<Customer> getCustomers () {
        return this.customerRepository.findAll();
    }

    public List<Customer> saveAllCustomers (List<Customer> customers) {
        return this.customerRepository.saveAll(customers);
    }

    public Customer saveCustomer (Customer customer) {
        return this.customerRepository.save(customer);
    }

}
