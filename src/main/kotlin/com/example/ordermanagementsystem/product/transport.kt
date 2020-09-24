package com.example.ordermanagementsystem.product

import java.time.DateTimeException
import java.util.*
import javax.persistence.*
import javax.validation.constraints.NotBlank
import javax.validation.constraints.NotNull

@Entity
@Table(name = "transport")
@NamedQuery(name="Transport.findByOrderID", query="SELECT p FROM Transport p WHERE p.ORDER_ID = :ORDER_ID")
data class Transport (
        @Id @GeneratedValue(strategy=GenerationType.IDENTITY)
        var ID: Int = 0,
        @NotNull
        var ORDER_ID: Int = 0,
        @NotNull
        var STAGE_ID: Int = 0,
        @get: NotBlank
        var STATUS: String = " ",
        @NotNull
        var START_TIME: Date = Date(),
        var END_TIME_TIME: Date? = Date()
        )