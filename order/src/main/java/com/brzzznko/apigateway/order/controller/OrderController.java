package com.brzzznko.apigateway.order.controller;

import com.brzzznko.apigateway.order.api.model.OrderDTO;
import com.brzzznko.apigateway.order.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static com.brzzznko.apigateway.order.api.ApiConstantOrder.API_ORDERS;
import static com.brzzznko.apigateway.order.api.ApiConstantOrder.API_ORDERS_ID_PARAM;

@RestController
@RequiredArgsConstructor
public class OrderController {

    private final OrderService service;

    @GetMapping(API_ORDERS)
    public List<OrderDTO> getOrders(@RequestParam(API_ORDERS_ID_PARAM) Long id) {
        return service.getOrders(id);
    }

}
