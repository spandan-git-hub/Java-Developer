package com.example.simpleWebApp.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.simpleWebApp.Model.Product;

@Repository 
public interface ProductRepo extends JpaRepository<Product, Integer> {
    
}
