package com.springdatajpa.springdatajpa.entity;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;
import lombok.Data;
import lombok.Setter;

@Data
@Entity
@Table(name = "products",  uniqueConstraints = {
		@UniqueConstraint(name = "sku_unique", columnNames = "stock_keeping_unit"),
		@UniqueConstraint(name = "name_unique", columnNames = "name") })
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name="stock_keeping_unit",nullable = false)
	private String sku;
	private String name;
	private String description;
	private BigDecimal price;
	private boolean active;
	private String imageurl;
	
	@CreationTimestamp
	private LocalDateTime dateCreated;
	@UpdateTimestamp
	private LocalDateTime lastupdated;
        
        @ManyToOne
        @JoinColumn(name="category_id", referencedColumnName = "id")
        private ProductCategory category;

}
