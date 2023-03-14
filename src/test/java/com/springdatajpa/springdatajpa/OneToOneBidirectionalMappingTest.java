/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.springdatajpa.springdatajpa;

import com.springdatajpa.springdatajpa.entity.Address;
import com.springdatajpa.springdatajpa.entity.Order;
import com.springdatajpa.springdatajpa.repository.AddressRepository;
import java.math.BigDecimal;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 *
 * @author princi
 */
@SpringBootTest
public class OneToOneBidirectionalMappingTest {
    
    @Autowired
    private AddressRepository addressRepository;
    
    @Test
    void saveAddresMethod(){
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
        a.setOrder(o);
        
        addressRepository.save(a);
    }
    
    @Test
    void updateAddressMethod(){
        Address o=addressRepository.findById(1L).get();
        o.setZipCode("123456789");
        
        o.getOrder().setStatus("delivered");
       
        addressRepository.save(o);
    }
    
    @Test
    void deleteAddressMethod(){
        addressRepository.deleteById(1L);
    }
    
    @Test
    void getAddressMethod(){
        Address o=addressRepository.findById(1L).get();
        System.out.println(o.toString());
    }
}
