package com.brzzznko.apigateway.customer.controller;

import com.brzzznko.apigateway.customer.api.ApiConstantCustomer;
import com.brzzznko.apigateway.customer.api.dto.CustomerDTO;
import com.brzzznko.apigateway.customer.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class CustomerController {

    private final CustomerService service;

    @GetMapping(ApiConstantCustomer.API_CUSTOMER)
    public CustomerDTO getCustomer(@PathVariable Long id) {
        return service.getCustomer(id);
    }

}
