package com.example.ordermanagementsystem.dao
import com.example.ordermanagementsystem.product.Product_Price
import org.springframework.stereotype.Repository
import com.example.ordermanagementsystem.productrepository.ProdPriceRepository

@Repository
class ProductPriceDao(private val pricerep:ProdPriceRepository){
    fun addProdPrice(price:Product_Price){
        pricerep.save(price)
    }
    fun getPriceByID(id:Int):Double{
        return pricerep.findAmtByProductId(id)
    }
}

