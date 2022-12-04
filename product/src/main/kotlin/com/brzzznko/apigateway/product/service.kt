package com.brzzznko.apigateway.product

import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Service

@Service
class ProductService(private val repository: ProductRepository) {

    fun getProduct(id: Long): Product {
        return repository.findByIdOrNull(id) ?: throw IllegalArgumentException("Product wth id {id} not found")
    }
}
