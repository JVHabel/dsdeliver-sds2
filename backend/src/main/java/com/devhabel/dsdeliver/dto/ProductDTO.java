package com.devhabel.dsdeliver.dto;

import java.io.Serializable;

import com.devhabel.dsdeliver.entities.Product;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductDTO implements Serializable {
	private static final long serialVersionUID = 1L; 
	
	private Long id;
	private String name;
	private Double price;
	private String description;
	private String imageUri;
	
	public ProductDTO(Product entity) {
		super();
		id = entity.getId();
		name = entity.getName();
		price = entity.getPrice();
		description = entity.getDescription();
		imageUri = entity.getImageUri();
		
	}

}
