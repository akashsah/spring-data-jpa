/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.springdatajpa.springdatajpa;

import com.springdatajpa.springdatajpa.entity.Address;
import com.springdatajpa.springdatajpa.entity.Order;
import com.springdatajpa.springdatajpa.entity.OrderItem;
import com.springdatajpa.springdatajpa.entity.Product;
import com.springdatajpa.springdatajpa.repository.OrderRepository;
import com.springdatajpa.springdatajpa.repository.ProductRepository;
import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 *
 * @author princi
 */
@SpringBootTest
public class oneToManyManyMappingTest {
    @Autowired
    ProductRepository productRepository;
    
    @Autowired
    OrderRepository orderRepository;
    
    @Test
     void saveOrderMethod(){
        Order order = new Order();
        order.setOrderTrackingNumber("100ABC");
        order.setStatus("In progress");

        // create order item 1
        OrderItem orderItem1 = new OrderItem();
        orderItem1.setProduct(productRepository.findById(1L).get());
        orderItem1.setQuantity(2);
        orderItem1.setPrice(orderItem1.getProduct().getPrice().multiply(new BigDecimal(2)));
        orderItem1.setImageUrl("image1.png");
        //orderItem1.setOrder(order);
        order.getOrderItems().add(orderItem1);

        // create order item 2
        OrderItem orderItem2 = new OrderItem();
        orderItem2.setProduct(productRepository.findById(2L).get());
        orderItem2.setQuantity(3);
        orderItem2.setPrice(orderItem2.getProduct().getPrice().multiply(new BigDecimal(3)));
        orderItem2.setImageUrl("image2.png");
        //orderItem2.setOrder(order);
        order.getOrderItems().add(orderItem2);

        order.setTotalPrice(order.getTotalAmount());
        order.setTotalQuantity(2);

        Address address = new Address();
        address.setCity("Pune");
        address.setStreet("Kothrud");
        address.setState("Maharashtra");
        address.setCountry("India");
        address.setZipCode("411047");

        order.setBillingAddress(address);

        orderRepository.save(order);
     }
    
     @Test
     void fetchOrderMethod(){
         Optional<Order> order=orderRepository.findById(1L);
         
         System.out.println(order.get());
     }
}
