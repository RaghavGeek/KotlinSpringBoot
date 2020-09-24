package com.example.ordermanagementsystem.service

import com.example.ordermanagementsystem.dao.*
import com.example.ordermanagementsystem.product.Order_Details
import com.example.ordermanagementsystem.product.Transport
import org.springframework.stereotype.Service
import java.time.LocalDate
@Service
class OrderService(private val orddao: OrderDao,private val proddao: ProductDao,private val pricedao:ProductPriceDao,private val transdao:TransportDao)
{
    fun createNewOrder(id: Int,qty:Int):String {
        var result = " "
        result = when {
            proddao.getProdByQty(id) == null -> {
                "Product with $id doesn't exist"
            }
            proddao.getProdByQty(id).QTY < qty -> {
                "Product with $id doesn't has sufficient quantity"
            }
            proddao.getProdByQty(id).VALID_TO < java.sql.Date.valueOf(LocalDate.now()) && proddao.getProdByQty(id).VALID_FROM > java.sql.Date.valueOf(LocalDate.now()) -> {
                "Product with $id is not valid"
            }
            else -> {
                var totalPrice:Double = 0.0
                totalPrice = qty * pricedao.getPriceByID(id)
                var order:Order_Details = orddao.createNewOrder(Order_Details(0,id,totalPrice))
                transdao.createNewTransportRequest(Transport(0,order.ORDER_ID,0,"Order Placed",java.sql.Date.valueOf(LocalDate.now()),null))
                order.toString()
            }
        }
        return result
    }
    fun getOrderByID(id:Int):String{
        var result = " "
        result = when {
            orddao.getOrderById(id) == null ->{
                "Order with $id not found"
            }
            else ->{
                orddao.getOrderById(id).toString()
            }
        }
        return result
    }
}