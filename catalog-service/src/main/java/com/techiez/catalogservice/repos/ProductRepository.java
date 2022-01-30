package com.techiez.catalogservice.repos;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.techiez.catalogservice.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{
	Optional<Product> findByCode(String code);
}
