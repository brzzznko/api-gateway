package com.brzzznko.apigateway.order.repository;

import com.brzzznko.apigateway.order.model.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OrderRepository extends JpaRepository<Order, Long> {

    List<Order> findAllByClientId(Long clientId);

}
