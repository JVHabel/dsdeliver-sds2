package com.devhabel.dsdeliver.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devhabel.dsdeliver.dto.ProductDTO;
import com.devhabel.dsdeliver.services.ProductService;

@RestController
@RequestMapping(value = "/product" )
public class ProductController {
	
	@Autowired
	private ProductService service;
	
	@GetMapping
	public ResponseEntity<List<ProductDTO>> findALL () {
		List<ProductDTO> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
}
