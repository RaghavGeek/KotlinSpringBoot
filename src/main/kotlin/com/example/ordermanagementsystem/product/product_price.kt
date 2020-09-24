package com.example.ordermanagementsystem.product
import java.util.*
import javax.persistence.*
import javax.validation.constraints.NotBlank
import javax.validation.constraints.NotNull

@Entity
@Table(name="product_price")
@NamedQuery(name="Product_Price.findAmtByProductId", query="SELECT p.AMOUNT FROM Product_Price p WHERE p.PRODUCT_ID = :PRODUCT_ID")
data class Product_Price (
        @Id @GeneratedValue(strategy = GenerationType.AUTO)
        var ID:Int = 0,
        @NotNull
        var PRODUCT_ID: Int = 0,
        @NotNull
        var AMOUNT: Double = 0.0,
        @get: NotBlank
        var CURRENCY: String = "",
        @NotNull
        var VALID_FROM: Date = Date(),
        @NotNull
        var VALID_TO: Date = Date()
        )