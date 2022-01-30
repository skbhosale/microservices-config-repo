package com.techiez.catalogservice.dto;

import javax.persistence.Column;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductDTO {


	Long id;
	
    private String code;
    private String name;
    private String description;
    private double price;
	
    
}
