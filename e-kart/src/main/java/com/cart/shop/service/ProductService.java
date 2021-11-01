package com.cart.shop.service;

import java.util.List;

import com.cart.shop.entity.Product;

public interface ProductService {
	Product saveProduct(Product product);

	Product updateProduct(Product product);

	Product deleteProduct(Long id);

	List<Product> getProduct();

}
