package com.cursojava.webservices.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cursojava.webservices.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

    
}
