package com.cart.shop.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cart.shop.entity.Address;
import com.cart.shop.service.AddressService;
@RestController
@RequestMapping("/api/address")
public class AddressController {
	@Autowired
	private AddressService addressService;

	@GetMapping("/getAll")
	public List<Address> getAllAddress() {
		return addressService.getAddress();
	}

	@PostMapping("/saveAddress")
	public Long saveAddress(@RequestBody Address address) {
		return addressService.saveAddress(address).getAddressId();
	}

	@PutMapping
	public Address updateAddress(@RequestBody Address address) {
		return addressService.updateAddress(address);
	}
	
	@PutMapping("/deleteAddress/{id}")
	public Address deleteAddress(Long Id) {
		return addressService.deleteAddress(Id);
	}


}
