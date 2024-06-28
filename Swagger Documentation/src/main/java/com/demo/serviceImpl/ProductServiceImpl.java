package com.demo.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.entity.Product;
import com.demo.repository.ProductRepository;
import com.demo.service.ProductService;
@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductRepository productRepository;

	@Override
	public Product addProduct(Product product) {
		Product prod=productRepository.save(product);
		return prod;
	}

	@Override
	public List<Product> getAllProduct() {
		return productRepository.findAll();
		
	}

	@Override
	public Product getProduct(Long id) {
		Product prod=productRepository.findById(id).get();
		return prod;
	}

	@Override
	public Product updateProduct(Product product, Long id) {
		Product prod=productRepository.findById(id).get();
		prod.setId(product.getId());
		prod.setName(product.getName());
		prod.setDescription(product.getDescription());
		prod.setPrice(product.getPrice());
		return productRepository.save(prod);
		
	}

	@Override
	public void deleteProducts(Long id) {
		productRepository.deleteById(id);
			   
	}
	
	
}
