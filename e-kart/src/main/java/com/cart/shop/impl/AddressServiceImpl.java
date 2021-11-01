package com.cart.shop.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cart.shop.entity.Address;
import com.cart.shop.repository.AddressRepository;
import com.cart.shop.service.AddressService;

@Service
public class AddressServiceImpl implements AddressService {
	@Autowired
	private AddressRepository addressRepository;

	@Override
	public Address saveAddress(Address address) {
		return addressRepository.save(address);
	}

	@Override
	public Address updateAddress(Address address) {
		return addressRepository.save(address);
	}

	@Override
	public Address deleteAddress(Long id) {
		Address address = addressRepository.findById(id).get();
		address.setDeleted(true);
		return addressRepository.save(address);
	}

	@Override
	public List<Address> getAddress() {
		return addressRepository.findAll();
	}

}
