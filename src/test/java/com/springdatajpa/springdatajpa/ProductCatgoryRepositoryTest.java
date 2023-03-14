/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.springdatajpa.springdatajpa;

import com.springdatajpa.springdatajpa.entity.Product;
import com.springdatajpa.springdatajpa.entity.ProductCategory;
import com.springdatajpa.springdatajpa.repository.ProductCatgoryRepository;
import java.math.BigDecimal;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 *
 * @author princi
 */
@SpringBootTest
public class ProductCatgoryRepositoryTest {
    @Autowired
    ProductCatgoryRepository repository;
    
    @Test
    void saveProductCategory(){
        ProductCategory productCategory = new ProductCategory();
        productCategory.setCategoryName("books");
        productCategory.setCategoryDescription("books description");

        Product product1 = new Product();
        product1.setName("Core Java");
        product1.setPrice(new BigDecimal(1000));
        product1.setImageurl("image1.png");
        product1.setSku("ABCD");
        product1.setActive(true);
        product1.setCategory(productCategory);
        productCategory.getProducts().add(product1);

        Product product2 = new Product();
        product2.setName("Effective Java");
        product2.setPrice(new BigDecimal(2000));
        product2.setImageurl("image2.png");
        product2.setSku("ABCDE");
        product2.setActive(true);
        product2.setCategory(productCategory);
        productCategory.getProducts().add(product2);

        repository.save(productCategory);
    }
}
