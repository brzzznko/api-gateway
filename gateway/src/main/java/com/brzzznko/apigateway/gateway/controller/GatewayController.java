package com.brzzznko.apigateway.gateway.controller;

import com.brzzznko.apigateway.gateway.model.OrdersDTO;
import com.brzzznko.apigateway.gateway.service.OrdersRequestAggregator;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.ExecutionException;

@RestController
@RequiredArgsConstructor
public class GatewayController {

    private final OrdersRequestAggregator aggregator;

    @GetMapping("api/v1/orders/")
    public OrdersDTO getOrders(@RequestParam("client_id") Long id)
            throws ExecutionException, InterruptedException {
        return aggregator.getOrders(id);
    }

}
