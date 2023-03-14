/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.springdatajpa.springdatajpa.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;
import java.util.HashSet;
import java.util.Set;
import lombok.Data;

/**
 *
 * @author princi
 */
@Data
@Entity
@Table(
name="users",
        uniqueConstraints = @UniqueConstraint(
                name="unique_email",
                columnNames = "email"
        ))
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    
    @ManyToMany(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
    @JoinTable(
    name="user_role",
            joinColumns = @JoinColumn(
            name="user_id",referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(
            name="role_id", referencedColumnName = "id"))
    private Set<Role> roles=new HashSet<>();
}
