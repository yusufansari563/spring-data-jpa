package com.jpa.demojpa.repository;

import com.jpa.demojpa.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer,Integer> {
}
