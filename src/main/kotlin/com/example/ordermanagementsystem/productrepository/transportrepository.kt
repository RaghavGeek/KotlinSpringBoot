package com.example.ordermanagementsystem.productrepository

import com.example.ordermanagementsystem.product.Transport
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.repository.query.Param
import org.springframework.stereotype.Repository

@Repository
interface TransportRepository : JpaRepository<Transport, Int>{
    fun findByOrderID(@Param("ORDER_ID") orderid: Int?): Transport?
}
