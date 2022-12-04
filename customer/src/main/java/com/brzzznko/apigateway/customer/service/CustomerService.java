package com.brzzznko.apigateway.customer.service;

import com.brzzznko.apigateway.customer.api.dto.CustomerDTO;
import com.brzzznko.apigateway.customer.model.entity.Customer;
import com.brzzznko.apigateway.customer.repository.CustomerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CustomerService {

    private final CustomerRepository repository;

    public CustomerDTO getCustomer(Long id) {
        return repository.findById(id)
                         .map(this::buildResponseDto)
                         .orElseThrow(() -> new IllegalArgumentException("Customer with id: " + id + " not found"));
    }

    private CustomerDTO buildResponseDto(Customer customer) {
        return CustomerDTO.builder().id(customer.getId()).name(customer.getName()).build();
    }

}
