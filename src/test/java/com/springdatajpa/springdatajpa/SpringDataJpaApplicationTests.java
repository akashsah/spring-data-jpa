package com.springdatajpa.springdatajpa;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.springdatajpa.springdatajpa.entity.Product;
import com.springdatajpa.springdatajpa.repository.ProductRepository;

@SpringBootTest
class SpringDataJpaApplicationTests {
	
	@Autowired
	ProductRepository productRepository;
        
	@Test
	void contextLoads() {
	}
	
	@Test
	void saveMethod() {
		Product product=new Product();
		product.setName("akash");
		product.setSku("hello workd");
                product.setDescription("hello workd");
                Product p=productRepository.save(product);
                System.out.println(p.toString());
		
	}

}
