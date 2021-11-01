package com.cart.shop.controller;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class EcartAdvice {

	@ExceptionHandler(Exception.class)
	public String hanldeException(Exception e) {
		return e.getMessage();
	}

}
