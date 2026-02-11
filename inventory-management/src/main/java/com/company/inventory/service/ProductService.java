package com.company.inventory.service;

import java.util.List;

import com.company.inventory.model.Product;

public interface ProductService {
	   Product saveProduct(Product product);

	    List<Product> getAllProducts();

	    Product getProductById(Long id);

	    void deleteProduct(Long id);
	}