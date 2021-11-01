package com.cart.shop.service;

import java.util.List;

import com.cart.shop.entity.Address;

public interface AddressService {
	Address saveAddress(Address address);

	Address updateAddress(Address address);

	Address deleteAddress(Long id);

	List<Address> getAddress();


}
