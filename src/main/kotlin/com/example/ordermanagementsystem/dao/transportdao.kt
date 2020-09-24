package com.example.ordermanagementsystem.dao
import com.example.ordermanagementsystem.product.Transport
import com.example.ordermanagementsystem.productrepository.TransportRepository
import org.springframework.stereotype.Repository



@Repository
class TransportDao(private val transportrep:TransportRepository){
    fun createNewTransportRequest(trans: Transport) {
        transportrep.save(trans)
    }

    fun getTransportByOrderId(id:Int):Transport? {
        var transport:Transport? = transportrep.findByOrderID(id)
        return transport
    }
}
