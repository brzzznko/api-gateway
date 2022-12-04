package com.brzzznko.apigateway.customer.api.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.extern.jackson.Jacksonized;

@Getter
@Builder
@Jacksonized
public class CustomerDTO {

    private final Long id;
    private final String name;

}
