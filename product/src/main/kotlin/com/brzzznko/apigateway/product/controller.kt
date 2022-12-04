package com.brzzznko.apigateway.product

import com.brzzznko.apigateway.product.api.ApiConstantProduct
import com.brzzznko.apigateway.product.api.ProductDTO
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController

@RestController
class ProductController(private val service: ProductService) {

    @GetMapping(ApiConstantProduct.API_PRODUCT)
    fun getProducts(@PathVariable id: Long): ProductDTO = service.getProduct(id)

}