package com.brzzznko.apigateway.gateway.model;

import lombok.Builder;
import lombok.Getter;
import lombok.extern.jackson.Jacksonized;

import java.util.List;

@Getter
@Builder
@Jacksonized
public class OrdersDTO {

    private final String customerName;
    private final List<OrderInfo> orders;

}
