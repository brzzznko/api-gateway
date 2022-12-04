package com.brzzznko.apigateway.gateway.clients;

import com.brzzznko.apigateway.customer.api.ApiConstantCustomer;
import com.brzzznko.apigateway.customer.api.dto.CustomerDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "customer", url = "${customer.api.path}")
public interface CustomerClient {

    @GetMapping(ApiConstantCustomer.API_CUSTOMER)
    CustomerDTO getCustomerInfo(@PathVariable Long id);

}
