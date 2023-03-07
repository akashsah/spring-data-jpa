/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.springdatajpa.springdatajpa.controller;

import com.springdatajpa.springdatajpa.repository.QuerryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author princi
 */
@RestController
public class QuerryController {
    
    /*@Autowired
    QuerryRepo repo;
    
    @GetMapping("/getQuerryData")
    public String getQuerryData(){
        return repo.findByNameJLPQLQuerry("akash", 1L).toString();
    }*/
}
