package com.brzzznko.apigateway.product.api

object ApiConstantProduct {
    const val API_PRODUCT = "/api/v1/products/{id}"
}

data class ProductDTO(val id: Long, val title: String)