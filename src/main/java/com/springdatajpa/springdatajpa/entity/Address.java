/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.springdatajpa.springdatajpa.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import java.time.LocalDateTime;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

/**
 *
 * @author princi
 */
@Data
@Entity
public class Address {
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private long id;
    private String street;
    private String city;
    private String state;
    private String country;
    private String zipCode;
    
    @OneToOne(cascade=CascadeType.ALL)
    @JoinColumn(name="order_id", referencedColumnName = "id")
    private Order order;
    
}
