package com.product.report.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.product.report.model.Product;
import com.product.report.repository.ProductRepository;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/api/v1")
public class ProductController {
	@Autowired
	private ProductRepository productRepository;

	@GetMapping("/prodcuts")
	public List<Product> getAllEmployees() {
		return productRepository.findAll();
	}
}
