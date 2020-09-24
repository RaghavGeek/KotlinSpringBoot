package com.example.ordermanagementsystem.productrepository

import com.example.ordermanagementsystem.product.Order_Details
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface OrderRepository : JpaRepository<Order_Details, Int>{

}
