package com.brzzznko.apigateway.gateway.clients;

import com.brzzznko.apigateway.product.api.ApiConstantProduct;
import com.brzzznko.apigateway.product.api.ProductDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "product", url = "${product.api.path}")
public interface ProductClient {

    @GetMapping(ApiConstantProduct.API_PRODUCT)
    ProductDTO getProductInfo(@PathVariable Long id);

}
