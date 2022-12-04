package com.brzzznko.apigateway.product

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController

@RestController
class ProductController(private val service: ProductService) {

    @GetMapping("/api/v1/products/{id}")
    fun getProducts(@PathVariable id: Long): Product = service.getProduct(id)

}