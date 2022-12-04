package com.brzzznko.apigateway.order.api.model;

import lombok.Builder;
import lombok.Getter;
import lombok.extern.jackson.Jacksonized;

@Getter
@Builder
@Jacksonized
public class OrderDTO {

    private final Long id;
    private final Long productId;

}
