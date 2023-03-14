/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.springdatajpa.springdatajpa.repository;

import com.springdatajpa.springdatajpa.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author princi
 */
public interface RoleRepository extends JpaRepository<Role, Long>{
    
}
