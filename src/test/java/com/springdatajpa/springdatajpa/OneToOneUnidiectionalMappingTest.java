/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.springdatajpa.springdatajpa;

import com.springdatajpa.springdatajpa.entity.Address;
import com.springdatajpa.springdatajpa.entity.Order;
import com.springdatajpa.springdatajpa.repository.OrderRepository;
import java.math.BigDecimal;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 *
 * @author princi
 */
@SpringBootTest
public class OneToOneUnidiectionalMappingTest {
    @Autowired
    private OrderRepository orderRepository;
    
    @Test
    void saveOrderMethod(){
        Order o=new Order();
        o.setOrderTrackingNumber("10000ABC");
        o.setTotalQuantity(5);
        o.setStatus("IN progress");
        o.setTotalPrice(new BigDecimal(100000));
        
        Address a=new Address();
        a.setCity("chandigarh");
        a.setCountry("india");
        a.setState("punjab");
        a.setStreet("daria");
        a.setZipCode("160101");
        
        o.setBillingAddress(a);
        orderRepository.save(o);
    }
    
    
    @Test
    void updateOrderMethod(){
        Order o=orderRepository.findById(1L).get();
        o.setStatus("Deliverd");
        
        o.getBillingAddress().setZipCode("785621");
       
        orderRepository.save(o);
    }
    
    @Test
    void deleteOrderMethod(){
        orderRepository.deleteById(1L);
    }
    
    @Test
    void getOrderMethod(){
        Order o=orderRepository.findById(1L).get();
        System.out.println(o.toString());
    }
    
}
