/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.springdatajpa.springdatajpa.repository;

import com.springdatajpa.springdatajpa.entity.Product;
import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 *
 * @author princi
 */
public interface QuerryMethodRepo extends JpaRepository<Product, Long>{
    public Optional<Product> findByName(String name);
    public Optional<Product> findByNameAndId(String name,Long id);
    
    
}
