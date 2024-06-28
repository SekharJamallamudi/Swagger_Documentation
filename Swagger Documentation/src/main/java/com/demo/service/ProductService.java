package com.demo.service;

import java.util.List;

import com.demo.entity.Product;

public interface ProductService {

	Product addProduct(Product product);

	List<Product> getAllProduct();

	Product getProduct(Long id);

	Product updateProduct(Product product, Long id);

	void deleteProducts(Long id);

	
	
}
