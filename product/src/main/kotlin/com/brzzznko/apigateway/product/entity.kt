package com.brzzznko.apigateway.product

import javax.persistence.*

@Entity
@Table(name = "products")
class Product(
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    var id: Long,
    var title: String
)