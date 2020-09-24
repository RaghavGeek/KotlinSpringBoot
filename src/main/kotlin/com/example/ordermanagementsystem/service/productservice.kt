package com.example.ordermanagementsystem.service

import com.example.ordermanagementsystem.dao.ProductDao
import com.example.ordermanagementsystem.dao.ProductPriceDao
import com.example.ordermanagementsystem.product.Order_Details
import com.example.ordermanagementsystem.product.Product
import com.example.ordermanagementsystem.product.Transport
import org.springframework.stereotype.Service
import java.sql.Date
import java.time.LocalDate
@Service
class ProductService(private val proddao:ProductDao,private val pricedao: ProductPriceDao)
{
    fun createNewProduct(prod: Product) =
            proddao.createNewProduct(prod)
    fun getProdByQty(id:Int,qty:Int):String{
        var result = " "
        result = when {
            proddao.getProdByQty(id) == null -> {
                "Product with $id doesn't exist"
            }
            proddao.getProdByQty(id).QTY < qty -> {
                "Product with $id doesn't has sufficient quantity"
            }
            proddao.getProdByQty(id).VALID_TO < java.sql.Date.valueOf(LocalDate.now())  -> {
                "Product with $id is not valid"
            }
            else -> {
                proddao.getProdByQty(id).toString()
            }
        }
        return result
    }
    fun getProdTotalPrice(id:Int,qty:Int):String{
        var result = " "
        result = when {
            proddao.getProdByQty(id) == null -> {
                "Product with $id doesn't exist"
            }
            proddao.getProdByQty(id).QTY < qty -> {
                "Product with $id doesn't has sufficient quantity"
            }
            proddao.getProdByQty(id).VALID_TO < java.sql.Date.valueOf(LocalDate.now())  -> {
                "Product with $id is not valid"
            }
            else -> {
                var totalPrice:Double = 0.0
                totalPrice = qty * pricedao.getPriceByID(id)
                totalPrice.toString()
            }
        }
        return result
    }
}