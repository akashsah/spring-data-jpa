/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.springdatajpa.springdatajpa.controller;

import com.springdatajpa.springdatajpa.repository.QuerryMethodRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author princi
 */
@RestController("/")
public class QuerryMethodController {
    
    @Autowired
    QuerryMethodRepo repo;
    
    @GetMapping("findByName")
    public String findByName(){
        return repo.findByName("akash").toString();
    }
    
    @GetMapping("findByNameAndId")
    public String findByNameAndId(){
        return repo.findByNameAndId("akash",1L).toString();
    }
    
}
