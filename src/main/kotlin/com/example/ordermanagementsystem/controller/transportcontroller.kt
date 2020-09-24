package com.example.ordermanagementsystem.controller
import com.example.ordermanagementsystem.service.TransportService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api")
class TransportController(private val transservice:TransportService) {
    @GetMapping("/transport/{orderid}")
    fun getTransportByOrderId(@PathVariable(value = "orderid") id:Int): ResponseEntity<String>  {
        return ResponseEntity.ok().body(transservice.getTransportByOrderId(id))
    }
}