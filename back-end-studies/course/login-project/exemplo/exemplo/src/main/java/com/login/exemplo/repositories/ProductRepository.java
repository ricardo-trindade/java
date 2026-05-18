package com.login.exemplo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.login.exemplo.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {
	
}
