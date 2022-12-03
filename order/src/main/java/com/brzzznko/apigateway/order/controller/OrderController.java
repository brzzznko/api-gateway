package com.brzzznko.apigateway.order.controller;

import com.brzzznko.apigateway.order.model.OrderDTO;
import com.brzzznko.apigateway.order.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class OrderController {

    private final OrderService service;

    @GetMapping("api/v1/orders/{client_id}")
    public List<OrderDTO> getOrders(@PathVariable("client_id") Long id) {
        return service.getOrders(id);
    }

}
