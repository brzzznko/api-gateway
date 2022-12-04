package com.brzzznko.apigateway.customer.repository;

import com.brzzznko.apigateway.customer.model.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

}
