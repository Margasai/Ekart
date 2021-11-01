package com.cart.shop.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cart.shop.entity.Product;
import com.cart.shop.service.ProductService;
@RestController
@RequestMapping("/api/product")
public class ProductController {
	@Autowired
	private ProductService productService;

	@GetMapping("/getAll")
	public List<Product> getAllProduct() {
		return productService.getProduct();
	}

	@PostMapping("/saveProduct")
	public Long saveProduct(@RequestBody Product product) {
		return productService.saveProduct(product).getProductId();
	}

	@PutMapping
	public Product updateProduct(@RequestBody Product product) {
		return productService.updateProduct(product);
	}
	
	@PutMapping("/deleteProduct/{id}")
	public Product deleteProduct(Long Id) {
		return productService.deleteProduct(Id);
	}

}
