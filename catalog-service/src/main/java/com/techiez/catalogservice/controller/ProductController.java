package com.techiez.catalogservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.techiez.catalogservice.entities.Product;
import com.techiez.catalogservice.service.ProductService;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/api/products")
@Slf4j
public class ProductController {
	private final ProductService productService;
	
	 @Autowired
	    public ProductController(ProductService productService) {
	        this.productService = productService;
	    }
	 
	 @GetMapping("/products")
	    public List<Product> allProducts() {
	        return productService.findAllProducts();
	    }
	 
	 @GetMapping("/products/{code}")
	    public Product productByCode(@PathVariable String code) throws Exception {
	        return productService.findProductByCode(code)
	                .orElseThrow(() -> new Exception("Product with code ["+code+"] doesn't exist"));
	    }
}
