package com.example.ordermanagementsystem.productrepository
import com.example.ordermanagementsystem.product.Product_Price
import com.example.ordermanagementsystem.product.Transport
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.repository.query.Param
import org.springframework.stereotype.Repository


@Repository
interface ProdPriceRepository : JpaRepository<Product_Price, Int>{
    fun findAmtByProductId(@Param("PRODUCT_ID") productid: Int?): Double
}