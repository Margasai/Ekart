package com.cart.shop.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cart.shop.entity.User;
import com.cart.shop.service.UserService;

@RestController
@RequestMapping("/api/user")
public class UserController {

	@Autowired
	private UserService userService;

	@GetMapping("/getAll")
	public List<User> getAllUsers() {
		return userService.getUsers();
	}

	@PostMapping("/save")
	public Long saveUser(@RequestBody User user) throws Exception {
		return userService.saveUser(user).getUserID();
	}

	@PutMapping
	public User updateUser(@RequestBody User user) {
		return userService.updateUser(user);
	}
	
	@PutMapping("/delete/{id}")
	public User deleteUser(Long Id) {
		return userService.deleteUser(Id);
	}

}
