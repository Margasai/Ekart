package com.cart.shop.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cart.shop.entity.User;
import com.cart.shop.repository.UserRepository;
import com.cart.shop.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserRepository userRepository;

	@Override
	public User saveUser(User user) throws Exception {
		if (user.getAddress().size() >= 1) {
			if(user.getAddress().stream().map(adds->Boolean.TRUE.equals(adds.getIsPrimary())).collect(Collectors.toList()).size()>1)
				throw new Exception("User can have only one address as primary address");
			return userRepository.save(user);
		} else {
			throw new Exception("USer should have atleast one address");
		}
	}

	@Override
	public User updateUser(User user) {
		return userRepository.save(user);
	}

	@Override
	public User deleteUser(Long id) {
		User user = userRepository.findById(id).get();
		user.setDeleted(true);
		return userRepository.save(user);
	}

	@Override
	public List<User> getUsers() {
		return userRepository.findAll();
	}

}
