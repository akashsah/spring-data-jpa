package com.springdatajpa.springdatajpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springdatajpa.springdatajpa.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{
	

}
