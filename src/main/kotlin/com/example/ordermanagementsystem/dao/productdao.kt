package com.example.ordermanagementsystem.dao
import com.example.ordermanagementsystem.product.Product
import org.springframework.stereotype.Repository
import com.example.ordermanagementsystem.productrepository.ProdRepository

@Repository
class ProductDao(private val prodrep:ProdRepository){

    fun createNewProduct(prod: Product) =
            prodrep.save(prod)

    fun getProdByQty(id:Int):Product{
        return prodrep.findById(id).orElse(null)
    }
}

