package com.cart.shop.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cart.shop.entity.Product;
import com.cart.shop.repository.ProductRepository;
import com.cart.shop.service.ProductService;

@Service
public class ProductServicImpl implements ProductService{
	@Autowired
	private ProductRepository productRepository;

	@Override
	public Product saveProduct(Product product) {
		return productRepository.save(product);
	}

	@Override
	public  Product  updateProduct ( Product  product) {
		return productRepository.save(product);
	}

	@Override
	public  Product  deleteProduct (Long id) {
		 Product product =productRepository.findById(id).get();
		 product.setDeleted(true);
		return productRepository.save(product);
	}

	@Override
	public List<Product> getProduct () {
		return productRepository.findAll();
	}

}
