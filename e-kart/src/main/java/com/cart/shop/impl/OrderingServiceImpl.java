package com.cart.shop.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cart.shop.repository.ProductRepository;
import com.cart.shop.service.OrderingService;

@Service
public class OrderingServiceImpl implements OrderingService{
	
	@Autowired
	private ProductRepository productRepository;

	@Override
	public String placeOrder(Long qty) throws Exception {
		if(qty<=productRepository.findAll().size()) {
			return "Order successful";
		} else {
			throw new Exception("Order exceeded than available products");
		}
	}

}
