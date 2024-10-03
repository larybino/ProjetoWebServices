package com.cursojava.webservices.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cursojava.webservices.entities.OrderItem;
import com.cursojava.webservices.entities.pk.OrderItemPK;


public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK>{

    
}
