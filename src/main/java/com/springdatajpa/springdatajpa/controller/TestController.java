/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.springdatajpa.springdatajpa.controller;

import com.springdatajpa.springdatajpa.entity.Product;
import com.springdatajpa.springdatajpa.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author princi
 */
@RestController
public class TestController {

    @Autowired
    ProductRepository productRepository;

    @GetMapping("/hi")
    public String hi() {
        return "hello work";
    }

    @GetMapping("/save")
    public String save() {
        Product product = new Product();
        product.setName("akash");
        product.setSku("hello workd");
        product.setDescription("hello workd");
        Product p = productRepository.save(product);

        return productRepository.findAll().toString();
    }
    
    @GetMapping("/update")
    public String update() {
        Product product = productRepository.findById(1L).get();
        product.setImageurl("kakah.sahthdfd");
        Product p = productRepository.save(product);

        return productRepository.findAll().toString();
    }
    
    @GetMapping("/findBy")
    public String findeBy() {
        
        return productRepository.findById(1L).toString();
    }
}
