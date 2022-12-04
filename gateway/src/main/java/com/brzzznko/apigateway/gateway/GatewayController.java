package com.brzzznko.apigateway.gateway;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GatewayController {

    @GetMapping("api/v1/orders/")
    public String getOrders(@RequestParam("client_id") Long id) {
        return "orders list";
    }

}
