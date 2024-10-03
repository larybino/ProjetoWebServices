package com.cursojava.webservices.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cursojava.webservices.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

    
}
