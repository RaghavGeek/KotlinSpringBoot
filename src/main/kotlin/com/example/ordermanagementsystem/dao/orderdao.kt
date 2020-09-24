package com.example.ordermanagementsystem.dao
import com.example.ordermanagementsystem.product.Order_Details
import org.springframework.stereotype.Repository
import com.example.ordermanagementsystem.productrepository.OrderRepository

@Repository
class OrderDao(private val orderrep:OrderRepository){
    fun createNewOrder(ord: Order_Details):Order_Details {
        val orderResponse = orderrep.save(ord)
        return orderResponse
    }
    fun getOrderById(id:Int):Order_Details{
       return orderrep.findById(id).orElse(null)
    }
}