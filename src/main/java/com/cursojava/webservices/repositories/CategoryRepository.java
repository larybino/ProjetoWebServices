package com.cursojava.webservices.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cursojava.webservices.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

    
}
