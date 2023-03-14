/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.springdatajpa.springdatajpa;

import com.springdatajpa.springdatajpa.entity.Role;
import com.springdatajpa.springdatajpa.entity.User;
import com.springdatajpa.springdatajpa.repository.UserReporistory;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 *
 * @author princi
 */
@SpringBootTest
public class ManyToManyUnidirectionalTest {
    
    @Autowired
    UserReporistory userReporistory;
    
    @Test
    void saveUser(){
        User user = new User();
        user.setFirstName("ramesh");
        user.setLastName("fadatare");
        user.setEmail("ramesh@gmail.com");
        user.setPassword("secrete");

        Role admin = new Role();
        admin.setName("ROLE_ADMIN");

        Role customer = new Role();
        customer.setName("ROLE_CUSTOMER");

        user.getRoles().add(admin);
        user.getRoles().add(customer);

        userReporistory.save(user);
    }
}
