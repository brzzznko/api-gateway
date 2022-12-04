package com.brzzznko.apigateway.customer.service;

import com.brzzznko.apigateway.customer.model.entity.Customer;
import com.brzzznko.apigateway.customer.repository.CustomerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CustomerService {

    private final CustomerRepository repository;

    public Customer getCustomer(Long id) {
        return repository.findById(id)
                         .orElseThrow(() -> new IllegalArgumentException("Customer with id: " + id + " not found"));
    }

}
