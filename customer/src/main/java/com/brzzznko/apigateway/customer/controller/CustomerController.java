package com.brzzznko.apigateway.customer.controller;

import com.brzzznko.apigateway.customer.model.entity.Customer;
import com.brzzznko.apigateway.customer.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class CustomerController {

    private final CustomerService service;

    @GetMapping("api/v1/users/{id}")
    public Customer getCustomer(@PathVariable Long id) {
        return service.getCustomer(id);
    }

}
