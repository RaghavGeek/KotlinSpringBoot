package com.example.ordermanagementsystem.productrepository


import com.example.ordermanagementsystem.product.Product
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Modifying
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.query.Param
import org.springframework.stereotype.Repository
import javax.persistence.NamedQuery

@Repository
interface ProdRepository : JpaRepository<Product, Int>{

}
