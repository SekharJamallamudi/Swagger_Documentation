package com.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.entity.Product;
import com.demo.service.ProductService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
@RestController
@RequestMapping("/Product")
@Tag(
		name="Product controller All CRUD Api",
		description="this is the class implements all CRUD operations"
		
		)
public class ProductController {

	@Autowired
	private ProductService productService;
  
	@PostMapping("/")
	public ResponseEntity<Product>addProduct(@RequestBody Product product)
	{
		Product prod = productService.addProduct(product);
		return ResponseEntity.ok(prod);
	}
	@Operation(
			
			summary="finding all products from DB",
			description="getting all products from db using this api"
			
			)
	@ApiResponse(
			
			responseCode ="200",
			description="HTTP status 200 OK"
			
			)
	
	@GetMapping("/all")
	public List<Product> getAllProduct()
	{
		return productService.getAllProduct();
		
	}
	@GetMapping("/{id}")
	public ResponseEntity<Product>getProduct(@PathVariable Long id)
	{
		Product prod = productService.getProduct(id);
		return ResponseEntity.ok(prod);
		
	}
	@PutMapping("/{id}")
	public ResponseEntity<Product>updateProduct(@RequestBody Product product, @PathVariable Long id)
	{
		Product prod = productService.updateProduct(product,id);
		return ResponseEntity.ok(prod);
	}
	@DeleteMapping("/{id}")
	public void deleteProduct(@PathVariable Long id)
	{
	  productService.deleteProducts(id);
	}
}
