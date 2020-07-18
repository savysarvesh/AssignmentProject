package com.product.report.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.product.report.model.Product;
import com.product.report.repository.ProductRepository;

/**
 * The Class ProductService.
 */
@Service
public class ProductService {

	/** The product repository. */
	@Autowired
	private ProductRepository productRepository;

	/**
	 * List.
	 *
	 * @return the list
	 */
	public List<Product> list() {
		return productRepository.findAll();
	}

	/**
	 * Save.
	 *
	 * @param users the users
	 * @return the list
	 */
	public List<Product> save(List<Product> users) {
		return productRepository.saveAll(users);
	}
}
