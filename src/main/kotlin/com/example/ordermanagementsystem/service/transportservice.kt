package com.example.ordermanagementsystem.service
import com.example.ordermanagementsystem.dao.TransportDao
import org.springframework.stereotype.Service

@Service
class TransportService(private val transdao:TransportDao)
{
    fun getTransportByOrderId(id: Int):String {
        var response = transdao.getTransportByOrderId(id)
        return response.toString()
    }
}