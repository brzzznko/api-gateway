package com.brzzznko.apigateway.product

import com.brzzznko.apigateway.product.api.ProductDTO
import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Service

@Service
class ProductService(private val repository: ProductRepository) {

    fun getProduct(id: Long): ProductDTO {
        val product = repository.findByIdOrNull(id) ?: throw IllegalArgumentException("Product wth id {id} not found")
        return ProductDTO(product.id, product.title)
    }
}
