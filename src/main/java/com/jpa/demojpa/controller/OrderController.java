package com.jpa.demojpa.controller;

import com.jpa.demojpa.entity.Customer;
import com.jpa.demojpa.repository.CustomerRepository;
import com.jpa.demojpa.repository.ProductRepository;
import com.jpa.demojpa.service.OrderRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class OrderController {
    @Autowired
    private CustomerRepository customerRepository;
    @Autowired
    private ProductRepository productRepository;

    @PostMapping("/placeorder")
    public Customer placeOrder(@RequestBody OrderRequest request){
        return customerRepository.save(request.getCustomer());
    }

    @GetMapping("/findallorder")
    public List<Customer> findAllOrder(){
        return customerRepository.findAll();
    }
}
