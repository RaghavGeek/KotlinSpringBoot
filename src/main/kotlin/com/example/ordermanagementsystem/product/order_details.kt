package com.example.ordermanagementsystem.product
import javax.persistence.*
import javax.validation.constraints.NotNull

@Entity
@Table(name = "order_details")
data class Order_Details (
        @Id @GeneratedValue(strategy=GenerationType.IDENTITY)
        var ORDER_ID: Int = 0,
        @NotNull
        var PRODUCT_ID: Int = 0,
        @NotNull
        var TOTAL_PRICE: Double = 0.0

)