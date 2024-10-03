package com.cursojava.webservices.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cursojava.webservices.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

    
}
