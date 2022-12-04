package com.brzzznko.apigateway.gateway;

import com.brzzznko.apigateway.gateway.clients.OrderClient;
import com.brzzznko.apigateway.order.api.model.OrderDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class GatewayController {

    private final OrderClient ordersClient;

    @GetMapping("api/v1/orders/")
    public List<OrderDTO> getOrders(@RequestParam("client_id") Long id) {
        return ordersClient.getOrders(id);
    }

}
