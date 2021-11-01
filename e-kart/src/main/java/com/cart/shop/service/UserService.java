package com.cart.shop.service;

import java.util.List;

import com.cart.shop.entity.User;

public interface UserService {
	
	User saveUser(User user) throws Exception;

	User updateUser(User user);

	User deleteUser(Long id);

	List<User> getUsers();

}
