package com.brzzznko.apigateway.product

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class ProductEntryPoint

fun main(args: Array<String>) {
    runApplication<ProductEntryPoint>(*args)
}