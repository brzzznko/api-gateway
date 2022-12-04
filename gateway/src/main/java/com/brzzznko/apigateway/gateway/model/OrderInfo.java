package com.brzzznko.apigateway.gateway.model;

import lombok.Builder;
import lombok.Getter;
import lombok.extern.jackson.Jacksonized;

@Getter
@Builder
@Jacksonized
public class OrderInfo {

    private final Long id;
    private final Long productId;
    private final String title;

}
