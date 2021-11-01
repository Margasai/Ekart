package com.cart.shop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cart.shop.service.OrderingService;

@RestController
@RequestMapping("/api/order")
public class OrderController {
	
	@Autowired
	private OrderingService orderService;
	
	
	@PostMapping("/placeOrder")
	private String placeOrder(@PathVariable Long productQuantity) throws Exception {
		return orderService.placeOrder(productQuantity);
	}

}
