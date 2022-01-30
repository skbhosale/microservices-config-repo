package com.techiez.catalogservice.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techiez.catalogservice.entities.Product;
import com.techiez.catalogservice.repos.ProductRepository;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class ProductService {
	 private  ProductRepository productRepository;
	 
	 @Autowired
	 public ProductService(ProductRepository productRepository)
	 {
		 this.productRepository=productRepository;
		 
	 }
	 
	  public List<Product> findAllProducts() {
	        return productRepository.findAll();
	    }
	  public Optional<Product> findProductByCode(String code) {
	        return productRepository.findByCode(code);
	    }
	 
}

