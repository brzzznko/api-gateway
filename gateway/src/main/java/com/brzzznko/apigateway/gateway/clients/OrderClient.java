package com.brzzznko.apigateway.gateway.clients;

import com.brzzznko.apigateway.order.api.model.OrderDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

import static com.brzzznko.apigateway.order.api.ApiConstantOrder.API_ORDERS;
import static com.brzzznko.apigateway.order.api.ApiConstantOrder.API_ORDERS_ID_PARAM;

@FeignClient(name = "order", url = "${order.api.path}")
public interface OrderClient {

    @GetMapping(API_ORDERS)
    List<OrderDTO> getOrders(@RequestParam(API_ORDERS_ID_PARAM) Long id);

}
